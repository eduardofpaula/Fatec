import InterfaceStrategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    // Define a estratégia de pagamento
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Executa o pagamento
    public void pay(double amount) {
        strategy.pay(amount);
    }
}
