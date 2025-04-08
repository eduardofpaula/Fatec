package com.example.TDDPractice.ex2;

import lombok.Getter;

public class Email {
    private int id;
    @Getter
    private String name;

    public Email(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
