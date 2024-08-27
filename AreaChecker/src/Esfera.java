public class Esfera implements Calculable{
    private final double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return  4 * Math.PI * Math.pow(raio,2);
    }
}
