package DiferentsStrategys;

import InterfaceStrategy.PaymentStrategy;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Gerando boleto no valor de " + amount);
    }
}
