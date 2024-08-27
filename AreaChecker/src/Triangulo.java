public class Triangulo implements Calculable{
    private final double base;
    private final double altura;

    public Triangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
}
