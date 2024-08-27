public class Cilindro implements Calculable {
    private final double raio;
    private final double altura;

    public Cilindro(double raio,double altura){
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return 2 * Math.PI * (raio + altura);
    }
}
