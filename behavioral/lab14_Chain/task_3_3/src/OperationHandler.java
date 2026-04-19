public class OperationHandler implements Handler {
    private Handler next = null;

    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void solve(Equation equation){
        if (next != null)
            next.solve(equation);
    }
}
