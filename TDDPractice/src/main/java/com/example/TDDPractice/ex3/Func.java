package com.example.TDDPractice.ex3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Func {
    private String nome;
    private String email;
    @Getter
    private Double salarioBase;
    @Getter
    private Cargo cargo;
}

