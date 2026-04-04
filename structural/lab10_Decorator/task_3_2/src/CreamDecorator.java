public class CreamDecorator extends AddInDecorator {

    public CreamDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public String description(){
        return wrapee.description() + " + Cream";
    }

    @Override
    public float cost() {
        return wrapee.cost() + 0.1f;
    }
}
