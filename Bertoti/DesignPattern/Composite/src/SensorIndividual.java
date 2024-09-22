import InterfaceComposite.SensorComponent;

// Classe que representa um sensor individual de temperatura
public class SensorIndividual implements SensorComponent {
    private double temperatura;

    public SensorIndividual(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double getTemperatura() {
        return this.temperatura;
    }
}