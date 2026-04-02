public class StringDecorator  implements PrintString {
    private PrintString wrappee;

    public StringDecorator(PrintString wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print() {
        wrappee.print();
    }
}
