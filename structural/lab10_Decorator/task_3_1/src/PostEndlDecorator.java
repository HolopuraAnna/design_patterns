public class PostEndlDecorator extends StringDecorator{

    public PostEndlDecorator(PrintString wrapee) {
        super(wrapee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }
}
