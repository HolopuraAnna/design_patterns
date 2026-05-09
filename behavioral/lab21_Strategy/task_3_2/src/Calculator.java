public class Calculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void performOperation(int a, int b){
        if (strategy == null){
            System.out.println("Choose operation");
            return;
        }

        strategy.operation(a, b);
    }
}
