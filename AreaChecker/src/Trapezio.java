public class Trapezio implements Calculable {
    private final double b1;
    private final double b2;
    private final double altura;

    public Trapezio(double b1,double b2, double altura){
        this.b1 = b1;
        this.b2 = b2;
        this.altura = altura;
    }

    public double calcularArea(){
        return (b1 + b2) * altura / 2;
    }
}
