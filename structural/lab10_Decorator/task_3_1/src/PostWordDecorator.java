public class PostWordDecorator extends StringDecorator{
    private String word;

    public PostWordDecorator(PrintString wrapee, String word) {
        super(wrapee);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}
