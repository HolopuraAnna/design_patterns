public class Customer {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(int amount){
        if (strategy == null){
            System.out.println("Choose payment strategy");
            return;
        }

        strategy.makePayment(amount);
    }

}
