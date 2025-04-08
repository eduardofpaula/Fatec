package com.example.TDDPractice.ex2;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        String[] nameParts = p.getName().trim().split("\\s+");
        if (nameParts.length < 2 || !p.getName().matches("([A-Za-z]+\\s+){1,}[A-Za-z]+")) {
            errors.add("Nome inválido: deve conter ao menos duas partes e apenas letras.");
        }

        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("Idade inválida: deve estar entre 1 e 200.");
        }

        List<Email> emails = p.getEmails();
        if (emails == null || emails.isEmpty()) {
            errors.add("Deve haver ao menos um e-mail associado.");
        } else {
            for (Email e : emails) {
                if (!e.getName().matches(".+@.+\\..+")) {
                    errors.add("E-mail inválido: " + e.getName());
                }
            }
        }

        return errors;
    }
}
