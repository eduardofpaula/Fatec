// Classe Singleton para o sensor de temperatura
public class SensorTemperaturaGlobal {

    //  A unica instancia da classe, privada e estatica
    private static SensorTemperaturaGlobal instanciaUnica;

    // variavel para armazenar temperatura
    private double temperatura;

    // Cronstrutor privado para impedir que outras pessas criem instancias diretamente
    private SensorTemperaturaGlobal() {
        this.temperatura = 20.0;
    }

    // Método estático para obter a única instância da classe
    public static SensorTemperaturaGlobal getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new SensorTemperaturaGlobal();
        }
        return instanciaUnica;
    }

    // Método para obter a temperatura atual
    public double getTemperatura() {
        return temperatura;
    }

    // Método para ajustar a temperatura
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}