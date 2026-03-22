import coffeemaker.*;

public class Main {

    public static void main(String[] args) {

        CoffeeShop shop = new CoffeeShop();

        shop.sellCoffee(new EspressoMaker());
        shop.sellCoffee(new LatteMaker());
        shop.sellCoffee(new AmericanoMaker());
        shop.sellCoffee(new LatteMaker());
        shop.sellCoffee(new MochaMaker());
        shop.sellCoffee(new GlasseMaker());
        shop.sellCoffee(new IrishMaker());
        shop.sellCoffee(new LatteMaker());
        shop.sellCoffee(new CappuccinoMaker());
        shop.sellCoffee(new MochaMaker());
        shop.sellCoffee(new AmericanoMaker());

        System.out.println("Total profit: " + shop.calculateProfit());
    }
}