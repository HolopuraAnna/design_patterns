public class CarBuilder {

    private Car.Type type = Car.Type.Sedan;                //  Тип кузову
    private Car.CarColor carColor = Car.CarColor.White;    //  Колір
    private Engine engine = new EngineBuilder().build();   //  Двигун
    private Wheel wheel = new WheelBuilder().build();      //  Колеса


    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }


    public Car build(){
        return new Car(type, carColor, engine, wheel);
    }
}
