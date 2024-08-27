public class Hexagono implements Calculable {
    //declaração da variavel, final não muda o valor da variavel
    private final double lados;

    //construtor
    public Hexagono(double lados) {
        this.lados = lados;
    }

    //metodo para calcular a area do Hexagono
    @Override
    public double calcularArea() {
        return (3 * Math.pow(lados, 2) * Math.sqrt(lados)) / 2;
    }
}


