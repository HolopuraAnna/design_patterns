public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new SubtractionStrategy());
        calculator.performOperation(12, 13);
    }

}
