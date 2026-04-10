public class Main {
    public static void main(String[] args) {
        /*
        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);
        Car car = new Car(Car.Type.Sedan, Car.CarColor.White, engine, wheel);

        System.out.println(car);
        */

        Director director = new Director();

        Car car1 = director.Car1();
        System.out.println(car1);

        Car car2 = director.Car2();
        System.out.println(car2);

        Car car3 = director.Car3();
        System.out.println(car3);

        Car car4 = director.Car4();
        System.out.println(car4);
    }
}