public class App {
    public static void main(String[] args) throws Exception {
       // Obtendo a instância do sensor de temperatura global
       SensorTemperaturaGlobal sensor1 = SensorTemperaturaGlobal.getInstancia();
       System.out.println("Temperatura inicial: " + sensor1.getTemperatura());

       // Alterando a temperatura usando uma instância
       sensor1.setTemperatura(25.0);
       System.out.println("Temperatura ajustada por sensor1: " + sensor1.getTemperatura());

       // Tentando obter a instância novamente
       SensorTemperaturaGlobal sensor2 = SensorTemperaturaGlobal.getInstancia();
       System.out.println("Temperatura acessada por sensor2: " + sensor2.getTemperatura());

       // Verificando se sensor1 e sensor2 são a mesma instância
       if (sensor1 == sensor2) {
           System.out.println("sensor1 e sensor2 são a mesma instância.");
       } else {
           System.out.println("sensor1 e sensor2 são instâncias diferentes.");
       }
    }
}
