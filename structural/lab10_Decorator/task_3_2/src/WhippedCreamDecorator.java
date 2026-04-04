public class WhippedCreamDecorator extends AddInDecorator {

    public WhippedCreamDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public String description(){
        return wrapee.description() + " + Whipped cream";
    }

    @Override
    public float cost() {
        return wrapee.cost() + 0.18f;
    }
}
