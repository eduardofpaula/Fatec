import ClasseObserver.Aplicativo;
import ClasseObserver.Display;
import ClasseObserver.SistemaControle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        // Criação dos observadores
        Display display = new Display();
        Aplicativo aplicativo = new Aplicativo();
        SistemaControle sistemaControle = new SistemaControle();

        // Adicionando os observadores ao sensor
        sensor.adicionarObserver(display);
        sensor.adicionarObserver(aplicativo);
        sensor.adicionarObserver(sistemaControle);

        // Mudança de temperatura, todos os observadores serão notificados
        sensor.setTemperatura(22.5f);
        sensor.setTemperatura(24.0f);

        // Remover um observador e mudar a temperatura
        sensor.removerObserver(aplicativo);
        sensor.setTemperatura(26.5f);
    }
}