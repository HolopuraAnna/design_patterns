public class PrintableString implements PrintString {
    private final String base;

    public PrintableString(String base) {
        this.base = base;
    }

    @Override
    public void print() {
        System.out.print(base);
    }
}
