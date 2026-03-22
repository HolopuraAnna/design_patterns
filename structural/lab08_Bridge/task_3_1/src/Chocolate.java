public class Chocolate extends Beverage {

    public Chocolate(Milk milk, Serving serving) {
        super(milk, serving);
    }

    public String getType() {
        return "Chocolate";
    }
}
