package DiferentsStrategys;

import InterfaceStrategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.println("Pagando " + amount + " usando Cartão de Crédito. Número:  " + cardNumber);
    }
}

