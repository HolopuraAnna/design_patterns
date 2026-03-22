import coffee.Coffee;
import coffeemaker.CoffeeMaker;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

    private List<Coffee> soldCoffee = new ArrayList<>();

    public void sellCoffee(CoffeeMaker maker) {

        Coffee coffee = maker.makeCoffee();

        soldCoffee.add(coffee);
    }

    public double calculateProfit() {

        double profit = 0;

        for (Coffee c : soldCoffee) {
            profit += c.getProfit();
        }

        return profit;
    }
}
