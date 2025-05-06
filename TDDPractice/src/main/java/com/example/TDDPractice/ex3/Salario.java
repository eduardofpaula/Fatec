package com.example.TDDPractice.ex3;

public class Salario {
    public Double calcular(Func funcionario) {
        if (funcionario == null || funcionario.getCargo() == null || funcionario.getSalarioBase() == null)
            return 0.0;

        Double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();
        return salarioBase * (salarioBase >= cargo.getLimite() ? cargo.getTaxaSuperior() : cargo.getTaxaInferior());
    }
}
