public class Tea extends Beverage {

    public Tea(Milk milk, Serving serving) {
        super(milk, serving);
    }

    public String getType() {
        return "Tea";
    }
}
