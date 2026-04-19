public class Client {
    public static void main(String[] args) {

        Request[] requests = {
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE3),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE1),
        };

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        Handler handler4 = new ConcreteHandler4();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);


        for (Request request : requests) {
            handler1.handle(request);
        }


    }
}
