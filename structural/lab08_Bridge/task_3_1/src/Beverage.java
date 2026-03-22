public abstract class Beverage {

    protected Milk milk;
    protected Serving serving;

    public Beverage(Milk milk, Serving serving) {
        this.milk = milk;
        this.serving = serving;
    }

    public abstract String getType();

    public void serveBeverage() {
        System.out.println(getType() + " " + milk.addMilk() + ", " + serving.serve());
    }
}
