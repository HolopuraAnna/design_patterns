public class PostSpaceDecorator extends StringDecorator{

    public PostSpaceDecorator(PrintString wrapee) {
        super(wrapee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}
