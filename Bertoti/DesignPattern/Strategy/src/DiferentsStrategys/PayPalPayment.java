package DiferentsStrategys;

import InterfaceStrategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagando " + amount + " usando PayPal. Conta: " + email);
    }
}
