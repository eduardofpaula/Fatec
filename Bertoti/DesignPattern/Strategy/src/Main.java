import DiferentsStrategys.BoletoPayment;
import DiferentsStrategys.CreditCardPayment;
import DiferentsStrategys.PayPalPayment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pagamento com cartão de crédito
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-8765-4321"));
        paymentContext.pay(250.75);

        // Pagamento com PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.pay(120.50);

        // Pagamento com Boleto
        paymentContext.setPaymentStrategy(new BoletoPayment());
        paymentContext.pay(300.00);
    }
}