public class CelciusToFaren implements Convertible{
    public Double execute(Double value) {
        return (value * 9/5) + 32;
    }
}
