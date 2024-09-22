public class Main {
    public static void main(String[] args) {
        // Sensores individuais
        SensorIndividual sensor1 = new SensorIndividual(22.5);
        SensorIndividual sensor2 = new SensorIndividual(24.3);
        SensorIndividual sensor3 = new SensorIndividual(23.8);

        // Grupo de sensores
        GrupoSensores grupo1 = new GrupoSensores();
        grupo1.adicionar(sensor1);
        grupo1.adicionar(sensor2);

        // Outro grupo de sensores
        GrupoSensores grupo2 = new GrupoSensores();
        grupo2.adicionar(sensor3);
        grupo2.adicionar(grupo1);  // Adiciona o grupo1 como parte do grupo2

        // Testando a leitura da temperatura
        System.out.println("Temperatura do Sensor 1: " + sensor1.getTemperatura());
        System.out.println("Temperatura do Sensor 2: " + sensor2.getTemperatura());
        System.out.println("Temperatura média do Grupo 1: " + grupo1.getTemperatura());
        System.out.println("Temperatura média do Grupo 2 (incluindo Grupo 1): " + grupo2.getTemperatura());
    }
}
