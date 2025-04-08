package com.example.TDDPractice.ex3;

import lombok.Getter;

@Getter
public enum Cargo {
    DBA(2000.0, 0.75, 0.85),
    TESTADOR(2000.0, 0.75, 0.85),
    GERENTE(5000.0, 0.7, 0.8),
    DESENVOLVEDOR(3000.0, 0.8, 0.9);

    private Double limite;
    private Double taxaSuperior;
    private Double taxaInferior;

    Cargo(Double limite, Double taxaSuperior, Double taxaInferior) {
        this.limite = limite;
        this.taxaInferior = taxaInferior;
        this.taxaSuperior = taxaSuperior;
    }
}
