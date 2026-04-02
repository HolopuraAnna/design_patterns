public class PostExclaimDecorator extends StringDecorator{

    public PostExclaimDecorator(PrintString wrapee) {
        super(wrapee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
