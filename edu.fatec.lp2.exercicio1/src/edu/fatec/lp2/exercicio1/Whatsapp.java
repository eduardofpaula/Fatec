package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp() {
        contatos = new ArrayList<>();
        mensagens = new ArrayList<>();
    }

    public void listarContatos() {
        System.out.println(contatos);
    }

    public void listarMensagens() {
        System.out.println(mensagens);
    }
}
