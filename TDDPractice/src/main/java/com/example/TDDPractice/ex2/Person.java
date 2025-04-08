package com.example.TDDPractice.ex2;

import lombok.Getter;

import java.util.List;

public class Person {
    private int id;
    @Getter
    private String name;
    @Getter
    private int age;
    @Getter
    private List<Email> emails;

    // Getters, setters e construtor
    public Person(int id, String name, int age, List<Email> emails) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emails = emails;
    }
}
