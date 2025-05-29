public class Instructions {
    private String type;
    private Double value;

    public Instructions(String type, Double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Double getValue() {
        return value;
    }
}
