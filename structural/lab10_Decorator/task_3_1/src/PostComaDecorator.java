public class PostComaDecorator extends StringDecorator{

    public PostComaDecorator(PrintString wrapee) {
        super(wrapee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}
