public class Car {

    private static final int WHEEL_COUNT = 4;

    private Wheel[] wheels;
    private Engine engine;

    public Car() {
        this.engine = new Engine();

        this.wheels = new Wheel[WHEEL_COUNT];
        for (int i = 0; i < WHEEL_COUNT; i++) {
            wheels[i] = new Wheel();
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void drive() {
        System.out.println("The car is driving.");
    }
}
