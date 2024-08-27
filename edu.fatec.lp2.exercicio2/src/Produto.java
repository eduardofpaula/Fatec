public class Produto {

    private String nome;
    private String unidade;
    private double preco;
    private String descricao;
    private double descontoMaximo;
    private Supermercado supermercado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public Produto(String nome, String unidade, double preco, String descricao, double descontoMaximo, Supermercado supermercado) {
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.descricao = descricao;
        this.descontoMaximo = descontoMaximo;
        this.supermercado = supermercado;
    }

    public Produto(Supermercado s) {
        this.supermercado = s;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", unidade='" + unidade + '\'' +
                ", preco='" + preco + '\'' +
                ", descricao='" + descricao + '\'' +
                ", supermercado=" + supermercado +
                ", descontoMaximo=" + descontoMaximo +
                '}';
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
