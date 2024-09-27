package fatec.sp.gov.br.SpringBootLab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {

    @Autowired
    TrabalhoService trabalhoService;

    // metodo para cadastro
    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody RequestDTO requestDTO) throws Exception{

        trabalhoService.cadastro(requestDTO);

        return ResponseEntity.ok().body("Usuario Cadastrado");
    }

    // metodo para listar todos os usuarios
    @GetMapping("/listarAll")
    public ResponseEntity<List<Trabalho>> listar() throws Exception{
        trabalhoService.listarUsuarios();

        return ResponseEntity.ok().body(trabalhoService.listarUsuarios());
    }

    // metodo para listar um usuario a partir da consulta no banco
    @GetMapping("/consultar")
    public ResponseEntity<List<Trabalho>> consultar(@RequestParam String titulo, @RequestParam int nota) {
        return ResponseEntity.ok().body(trabalhoService.consultTitle(titulo, nota));
    }


}
