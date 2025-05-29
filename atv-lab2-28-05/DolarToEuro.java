public class DolarToEuro implements Convertible {
    public Double execute(Double value) {
        return value * 0.92; // cotação de 27/05
    }
}
