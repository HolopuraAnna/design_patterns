public class Director {

    public Car Car1(){
        return new CarBuilder().build();
    }

    public Car Car2(){
        return new CarBuilder()
                .setType(Car.Type.Hatchback)
                .setCarColor(Car.CarColor.Red)
                .setEngine(
                        new EngineBuilder()
                                .setPower(107)
                                .setTorque(130)
                                .setFuel(Engine.Fuel.Diesel)
                                .setVolume(1.7f)
                                .build())
                .setWheel(
                        new WheelBuilder()
                                .setMaterial(Wheel.Material.Steel)
                                .setDiameter(15)
                                .build())
                .build();
    }

    public Car Car3(){
        return new CarBuilder()
                .setType(Car.Type.SUV)
                .setCarColor(Car.CarColor.White)
                .setEngine(
                        new EngineBuilder()
                                .setPower(120)
                                .setTorque(170)
                                .setFuel(Engine.Fuel.Petrol)
                                .setVolume(3.0f)
                                .build())
                .setWheel(
                        new WheelBuilder()
                                .setMaterial(Wheel.Material.Forged)
                                .setDiameter(16)
                                .build())
                .build();
    }

    public Car Car4(){
        return new CarBuilder()
                .setType(Car.Type.Sedan)
                .setCarColor(Car.CarColor.Grey)
                .setEngine(
                        new EngineBuilder()
                                .setPower(150)
                                .setTorque(120)
                                .setFuel(Engine.Fuel.Electric)
                                .setVolume(2.5f)
                                .build())
                .setWheel(
                        new WheelBuilder()
                                .setMaterial(Wheel.Material.Alloy)
                                .setDiameter(14)
                                .build())
                .build();
    }
}
