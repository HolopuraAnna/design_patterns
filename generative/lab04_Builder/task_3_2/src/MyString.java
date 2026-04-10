public class MyString {

    private final String value;

    public MyString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "My string: " + value;
    }
}