package com.example.TDDPractice.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculadoraTest {

    @ParameterizedTest
    @MethodSource("provideInputAndExpectedValues")
    public void validarCalculoSalarioDesenvolvedor(String nome, String email, Double salarioBase, Cargo cargo, Double salarioExperado) {
        Func funcionario = new Func(nome, email, salarioBase, cargo);
        Salario cut = new Salario();
        Double salarioFinal = cut.calcular(funcionario);
        Assertions.assertEquals(salarioExperado, salarioFinal);
    }

    private static Stream<Arguments> provideInputAndExpectedValues() {
        return Stream.of(
                Arguments.of("Alice Silva", "alice.silva@empresa.com", 3000.0, null, 0.0),
                Arguments.of("Alice Silva", "alice.silva@empresa.com", 1000.0, Cargo.DESENVOLVEDOR, 900.0),
                Arguments.of("Alice Silva", "alice.silva@empresa.com", 4000.0, Cargo.DESENVOLVEDOR, 3200.0),
                Arguments.of("Alice Silva", "alice.silva@empresa.com", 3000.0, Cargo.DESENVOLVEDOR, 2400.0),
                Arguments.of("Bob Santos", "bob.santos@empresa.com", 1000.0, Cargo.DBA, 850.0),
                Arguments.of("Bob Santos", "bob.santos@empresa.com", 2000.0, Cargo.DBA, 1500.0),
                Arguments.of("Bob Santos", "bob.santos@empresa.com", 3000.0, Cargo.DBA, 2250.0),
                Arguments.of("Carlos Lima", "carlos.lima@empresa.com", 1000.0, Cargo.TESTADOR, 850.0),
                Arguments.of("Carlos Lima", "carlos.lima@empresa.com", 2000.0, Cargo.TESTADOR, 1500.0),
                Arguments.of("Carlos Lima", "carlos.lima@empresa.com", 3000.0, Cargo.TESTADOR, 2250.0),
                Arguments.of("Diana Costa", "diana.costa@empresa.com", 1000.0, Cargo.GERENTE, 800.0),
                Arguments.of("Diana Costa", "diana.costa@empresa.com", 5000.0, Cargo.GERENTE, 3500.0),
                Arguments.of("Diana Costa", "diana.costa@empresa.com", 6000.0, Cargo.GERENTE, 4200.0),
                Arguments.of("Eduardo Souza", "eduardo.souza@empresa.com", 0.0, Cargo.DESENVOLVEDOR, 0.0),
                Arguments.of("Fernanda Rocha", "fernanda.rocha@empresa.com", -1000.0, Cargo.DESENVOLVEDOR, -900.0),
                Arguments.of("Gabriel Almeida", "gabriel.almeida@empresa.com", null, Cargo.DESENVOLVEDOR, 0.0),

                Arguments.of("Helena Martins", "helena.martins@empresa.com", 2000.0, Cargo.GERENTE, 1600.0),
                Arguments.of("Igor Ferreira", "igor.ferreira@empresa.com", 5000.0, Cargo.TESTADOR, 3750.0),
                Arguments.of("Julia Pereira", "julia.pereira@empresa.com", 5000.0, Cargo.DBA, 3750.0),

                Arguments.of("Lucas Oliveira", "lucas.oliveira@empresa.com", 2999.99, Cargo.DESENVOLVEDOR, 2699.991),
                Arguments.of("Mariana Ribeiro", "mariana.ribeiro@empresa.com", 2000.01, Cargo.DBA, 1500.0075),
                Arguments.of("Nicolas Mendes", "nicolas.mendes@empresa.com", 4999.99, Cargo.GERENTE, 3999.992),
                Arguments.of("Olivia Barbosa", "olivia.barbosa@empresa.com", 2000.01, Cargo.TESTADOR, 1500.0075),
                Arguments.of("Paulo Araujo", "paulo.araujo@empresa.com", 0.0, null, 0.0)
        );

    }

    @Test
    void deveRetornarZeroQuandoFuncionarioForNull() {
        Salario calc = new Salario();
        Assertions.assertEquals(0.0, calc.calcular(null));
    }

    @Test
    void deveRetornarZeroQuandoCargoForNull() {
        Func f = new Func("Joao", "joao@email.com", 2000.0, null);
        Salario calc = new Salario();
        Assertions.assertEquals(0.0, calc.calcular(f));
    }

    @Test
    void deveRetornarZeroQuandoSalarioBaseForNull() {
        Func f = new Func("Joao", "joao@email.com", null, Cargo.DESENVOLVEDOR);
        Salario calc = new Salario();
        Assertions.assertEquals(0.0, calc.calcular(f));
    }
}
