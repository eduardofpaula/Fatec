package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    private String horaEnvio;
    private String conteudo;
    private Contatinho destinatario;

    public abstract Mensagem sendMessage(String a);

    @Override
    public String toString() {
        return "Mensagem{" +
                "horaEnvio='" + horaEnvio + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", destinatario=" + destinatario +
                '}';
    }
}
