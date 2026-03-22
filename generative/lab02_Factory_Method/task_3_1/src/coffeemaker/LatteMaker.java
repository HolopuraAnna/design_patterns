package coffeemaker;

import coffee.Coffee;
import coffee.Latte;

public class LatteMaker implements CoffeeMaker {
    public Coffee makeCoffee() {
        return new Latte();
    };
}
