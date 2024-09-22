import InterfaceComposite.SensorComponent;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um grupo de sensores
public class GrupoSensores implements SensorComponent {
    private List<SensorComponent> sensores;

    public GrupoSensores() {
        this.sensores = new ArrayList<>();
    }

    // Adiciona um sensor ao grupo (pode ser individual ou outro grupo)
    public void adicionar(SensorComponent sensor) {
        sensores.add(sensor);
    }

    // Remove um sensor do grupo
    public void remover(SensorComponent sensor) {
        sensores.remove(sensor);
    }

    @Override
    public double getTemperatura() {
        double soma = 0;
        int count = 0;

        // Calcula a média das temperaturas de todos os sensores no grupo
        for (SensorComponent sensor : sensores) {
            soma += sensor.getTemperatura();
            count++;
        }

        return count == 0 ? 0 : soma / count;  // Retorna a temperatura média
    }
}
