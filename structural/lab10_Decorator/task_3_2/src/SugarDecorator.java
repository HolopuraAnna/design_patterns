public class SugarDecorator extends AddInDecorator {

    public SugarDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public String description(){
        return wrapee.description() + " + Sugar";
    }

    @Override
    public float cost() {
        return wrapee.cost() + 0.05f;
    }
}
