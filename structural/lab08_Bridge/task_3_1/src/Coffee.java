public class Coffee extends Beverage {

    public Coffee(Milk milk, Serving serving) {
        super(milk, serving);
    }

    public String getType() {
        return "Coffee";
    }
}
