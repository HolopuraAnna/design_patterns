public class Canvas {

    public static void main(String[] args) {

        Size small = new Small();
        Size medium = new Medium();
        Size large = new Large();
        Size user = new UserSize();

        CheckboxButton checkboxButton = new CheckboxButton(small);
        checkboxButton.draw();

        RadioButton radioButton = new RadioButton(medium);
        radioButton.draw();

        Button dropdownButton = new DropdownButton(large);
        dropdownButton.draw();

        Button imageButton = new ImageButton(user);
        imageButton.draw();
    }
}
