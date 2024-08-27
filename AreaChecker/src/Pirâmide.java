public class Pirâmide implements Calculable {

    private double ladoBase;
    private double apotema;

    public Pirâmide(double ladoBase, double apotema) {
        this.ladoBase = ladoBase;
        this.apotema = apotema;
    }
    public double calcularArea() {

        double areaBase = ladoBase * ladoBase;

        double perimetroBase = 4 * ladoBase;
        double areaLateral = 0.5 * perimetroBase * apotema;

        return areaBase + areaLateral;
    }
}
