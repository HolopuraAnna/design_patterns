public class Main {

    public static void main(String[] args) {

        Milk withMilk = new WithMilk();
        Milk noMilk = new NoMilk();

        Serving dineIn = new DineIn();
        Serving takeAway = new TakeAway();

        Beverage b1 = new Coffee(withMilk, dineIn);
        Beverage b2 = new Coffee(noMilk, takeAway);
        Beverage b3 = new Tea(withMilk, takeAway);
        Beverage b4 = new Chocolate(noMilk, dineIn);

        b1.serveBeverage();
        b2.serveBeverage();
        b3.serveBeverage();
        b4.serveBeverage();
    }
}
