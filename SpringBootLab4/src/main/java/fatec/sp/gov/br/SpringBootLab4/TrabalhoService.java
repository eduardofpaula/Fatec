package fatec.sp.gov.br.SpringBootLab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;


//Crie um serviço com 3 métodos: um para cadastro, um para listar todos os registros da tabela e
//outro para buscar usando a consulta criada no item 2. No cadastro verifique se o título e o grupo
//        estejam preenchidos, lançando um erro em caso contrário. Ainda no cadastro, use a data/hora
//atual se a data/hora de entrega não estiver preenchida;

@Service
public class TrabalhoService {

    @Autowired
    TrabalhoRepository trabalhoRepository;

    // Metodo para cadastro
    public void cadastro(RequestDTO requestDTO) throws Exception {

        LocalDateTime tempo = null;

        if (requestDTO.titulo().isEmpty()) {
            throw new NoSuchElementException("TItulo vazio");
        }

        if (requestDTO.grupo().isEmpty()) {
            throw new NoSuchElementException("Grupo vazio");
        }

        if (requestDTO.data_hora_entrega() == null) {
            tempo = LocalDateTime.now();
        }

        Trabalho objCompleto = new Trabalho(
                requestDTO.id(),
                requestDTO.titulo(),
                tempo,
                requestDTO.descricao(),
                requestDTO.grupo(),
                requestDTO.nota(),
                requestDTO.justificativa());

        trabalhoRepository.save(objCompleto);
    }

    // Metodo para listar todos os usuarios
    public List<Trabalho> listarUsuarios() throws Exception{
        return trabalhoRepository.findAll();
    }

    // Metodo para listar um usuario a partir da consulta no banco
    public List<Trabalho> consultTitle(String titulo, int nota) {
        return trabalhoRepository.findTrabalhoByTituloAndNota(titulo, nota);
    }

}
