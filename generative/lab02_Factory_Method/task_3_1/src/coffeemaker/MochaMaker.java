package coffeemaker;

import coffee.Coffee;
import coffee.Mocha;

public class MochaMaker implements CoffeeMaker {
    public Coffee makeCoffee() {
        return new Mocha();
    };
}
