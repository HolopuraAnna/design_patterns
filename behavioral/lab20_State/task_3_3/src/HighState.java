public class HighState implements State {

    @Override
    public void turnUp(Fan fan) {
        System.out.println("Fan is already on high");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new StateMedium());
        System.out.println("Fan is on medium");
    }
}
