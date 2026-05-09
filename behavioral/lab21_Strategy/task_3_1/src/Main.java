public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setStrategy(new BankAccountStrategy());
        customer.makePayment(100);
    }

}
