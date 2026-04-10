public class MyStringBuilder {

    private String mystring = "";

    // додавання в кінець
    public MyStringBuilder append(String str) {
        StringBuilder stringBuilder = new StringBuilder(mystring);
        stringBuilder.append(str);
        this.mystring = stringBuilder.toString();

        return this;
    }

    // вставка у вказану позицію
    public MyStringBuilder insert(int index, String str) {
        if (index < 0 || index > mystring.length()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        StringBuilder stringBuilder = new StringBuilder(mystring);
        stringBuilder.insert(index, str);
        this.mystring = stringBuilder.toString();

        return this;
    }

    public MyString build() {
        return new MyString(mystring);
    }
}