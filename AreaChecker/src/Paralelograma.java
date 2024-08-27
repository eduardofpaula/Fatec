public class Paralelograma implements Calculable{
    private final double base;
    private final double altura;

    public Paralelograma(double base,double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
}
