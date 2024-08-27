public class Prisma implements Calculable{
    // Atributos do prisma
    private double comprimento;
    private double largura;
    private double altura;

    // Construtor para inicializar as dimensões do prisma
    public Prisma(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área da superfície do prisma
    public double calcularArea() {
        double areaBase = comprimento * largura;
        double perimetroBase = 2 * (comprimento + largura);
        double areaLateral = perimetroBase * altura;
        return 2 * areaBase + areaLateral;
    }
}