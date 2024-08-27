public class Quadrado implements Calculable {
    private final double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado,2);
    }
}
