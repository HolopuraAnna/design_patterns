public class CarSimulator {

    private Car car;
    private CarBuilder carBuilder;

    public CarSimulator() {
        this.carBuilder = new CarBuilder();

        this.car = carBuilder
                .setEngineCapacity(2.5)
                .setWheelSize(17.0)
                .build();
    }

    public void startSimulation() {
        System.out.println("Simulation started.");
        this.car.drive();
    }

    public static void main(String[] args) {
        CarSimulator simulator = new CarSimulator();
        simulator.startSimulation();
    }
}