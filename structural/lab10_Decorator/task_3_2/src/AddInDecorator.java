public class AddInDecorator extends Beverage {
    protected final Beverage wrapee;

    public AddInDecorator(Beverage wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public String description(){
        return wrapee.description();
    }

    @Override
    public float cost() {
        return wrapee.cost();
    }
}
