public class CarBuilder {

    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder setEngineCapacity(double capacity) {
        car.getEngine().setCapacity(capacity);
        return this;
    }

    public CarBuilder setWheelSize(double size) {
        for (Wheel wheel : car.getWheels()) {
            wheel.setSize(size);
        }
        return this;
    }

    public Car build() {
        return car;
    }
}