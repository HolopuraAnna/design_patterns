public class Main {
    public static void main(String[] args) {

        MyStringBuilder myStringBuilder = new MyStringBuilder();
        MyString stringToPrint = myStringBuilder
                .append("Hello")               // "Hello"
                .append("!")                   // "Hello!"
                .insert(5, "World")  // "HelloWorld!"
                .insert(5, " ")      // "Hello World!"
                .build();

        System.out.println(stringToPrint);
    }
}