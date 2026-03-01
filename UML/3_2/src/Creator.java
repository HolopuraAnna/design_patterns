public abstract class Creator {

    public void someOperation() {
        System.out.println("Creator: Starting operation...");

        Product product = createProduct();
        product.doSomething();

        System.out.println("Creator: Operation finished.");
    }

    public abstract Product createProduct();

    public static void main(String[] args) {

        Creator creator;

        creator = new ConcreteCreator1();
        creator.someOperation();

        System.out.println();

        creator = new ConcreteCreator2();
        creator.someOperation();
    }
}
