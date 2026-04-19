public class BaseHandler implements Handler {
    private Handler next;

    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
