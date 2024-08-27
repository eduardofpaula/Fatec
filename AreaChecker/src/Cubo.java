public class Cubo implements Calculable {
    //declaração da variavel, final faz com que o valor da variavel não mude
    private final double arestas;

    //construtor
    public Cubo(double arestas) {
        this.arestas = arestas;
    }

    //metodo para calcular a area do Cubo
    @Override
    public double calcularArea() {
        return Math.pow(arestas, 3);
    }
}
