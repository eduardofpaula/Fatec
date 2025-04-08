package com.example.TDDPractice.ex2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    PersonDAO personDAO = new PersonDAO();

    @Test
    void deveAceitarPessoaComDadosValidos() {
        var emails = List.of(new Email(1, "teste@email.com"));
        var pessoa = new Person(1, "Joao Silva", 30, emails);
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveApontarErroEmNomeComNumeros() {
        var pessoa = new Person(1, "Joao123 Silva", 30, List.of(new Email(1, "teste@email.com")));
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("Nome inválido")));
    }

    @Test
    void deveApontarErroEmNomeComApenasUmaPalavra() {
        var pessoa = new Person(1, "Joao", 30, List.of(new Email(1, "teste@email.com")));
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("Nome inválido")));
    }

    @Test
    void deveRejeitarNomeComEspacosSemLetras() {
        var pessoa = new Person(1, "123 456", 30, List.of(new Email(1, "teste@email.com")));
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("Nome inválido")));
    }

    @Test
    void deveInvalidarIdadeMuitoBaixa() {
        var pessoa = new Person(1, "Joao Silva", 0, List.of(new Email(1, "teste@email.com")));
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("Idade inválida")));
    }

    @Test
    void deveInvalidarIdadeExcessivamenteAlta() {
        var pessoa = new Person(1, "Joao Silva", 300, List.of(new Email(1, "teste@email.com")));
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("Idade inválida")));
    }

    @Test
    void deveInformarErroQuandoEmailsForemNulos() {
        var pessoa = new Person(1, "Joao Silva", 30, null);
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("e-mail associado")));
    }

    @Test
    void deveInformarErroQuandoListaDeEmailsEstiverVazia() {
        var pessoa = new Person(1, "Joao Silva", 30, new ArrayList<>());
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("e-mail associado")));
    }

    @Test
    void deveDetectarEmailComFormatoIncorreto() {
        var emails = List.of(new Email(1, "emailinvalido"));
        var pessoa = new Person(1, "Joao Silva", 30, emails);
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("E-mail inválido")));
    }

    @Test
    void deveDetectarPeloMenosUmEmailInvalidoEntreVarios() {
        var emails = List.of(
                new Email(1, "emailvalido@email.com"),
                new Email(2, "invalido")
        );
        var pessoa = new Person(1, "Joao Silva", 30, emails);
        var resultado = personDAO.isValidToInclude(pessoa);
        assertTrue(resultado.stream().anyMatch(msg -> msg.contains("E-mail inválido")));
    }

    @Test
    void deveIdentificarMaisDeUmErroSimultaneamente() {
        var emails = List.of(new Email(1, "semarroba"));
        var pessoa = new Person(1, "Joao", -5, emails);
        var resultado = personDAO.isValidToInclude(pessoa);
        assertEquals(3, resultado.size());
    }

}
