public class PreWordDecorator extends StringDecorator{
    private String word;

    public PreWordDecorator(PrintString wrapee, String word) {
        super(wrapee);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}
