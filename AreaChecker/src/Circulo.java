
// Classe circulo que implementa a interface Calculable
class Circulo implements Calculable{
    private final double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio;
    }
}
