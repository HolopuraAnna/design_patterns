public class Fan {

    private State state;

    public Fan() {
        state = new StateLow();
        System.out.println("Fan is on low");
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }

}
