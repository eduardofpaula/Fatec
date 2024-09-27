package fatec.sp.gov.br.SpringBootLab4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;;


//Crie um repositório para a classe criada no item 1 contendo uma consulta capaz de buscar todos
//os trabalhos que contenham uma palavra dentro de seu título com nota superior a um número
//inteiro. Tanto a palavra quanto o número devem ser recebidos como parâmetro do metodo;
@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, BigInteger> {

    // Metodo que retorna uma lista de trabalhos que contém uma palavra no título e nota maior que um número
    @Query(value = "select l from Trabalho l where l.titulo like %:titulo% and l.nota > :nota")
    List<Trabalho> findTrabalhoByTituloAndNota(String titulo, int nota);




}