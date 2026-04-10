public class EngineBuilder {

    int power = 105;                           //  Потужність
    int torque = 140;                          //  Крутний момент
    Engine.Fuel fuel = Engine.Fuel.Petrol;     //  Вид пального
    float volume = 1.4f;                       //  Об'єм двигуна


    public EngineBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    public EngineBuilder setTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public EngineBuilder setFuel(Engine.Fuel fuel) {
        this.fuel = fuel;
        return this;
    }

    public EngineBuilder setVolume(float volume) {
        this.volume = volume;
        return this;
    }


    public Engine build(){
        return new Engine(power, torque, fuel, volume);
    }
}
