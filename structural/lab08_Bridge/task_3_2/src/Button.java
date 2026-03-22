public abstract class Button {

    protected Size size;

    public Button(Size size) {
        this.size = size;
    }

    public abstract String getType();

    public void draw() {
        System.out.println("Drawing a " + size.getSize() + " " + getType() + ".");
    }
}
