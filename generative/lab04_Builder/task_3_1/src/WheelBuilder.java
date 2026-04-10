public class WheelBuilder {

    private Wheel.Material material = Wheel.Material.Steel;   // Матеріал диску
    int diameter = 14;                                       //  Діаметр колеса


    public WheelBuilder setMaterial(Wheel.Material material) {
        this.material = material;
        return this;
    }

    public WheelBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }


    public Wheel build(){
        return new Wheel(material, diameter);
    }
}
