public class MilkDecorator extends AddInDecorator {

    public MilkDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public String description(){
        return wrapee.description() + " + Milk";
    }

    @Override
    public float cost() {
        return wrapee.cost() + 0.08f;
    }
}
