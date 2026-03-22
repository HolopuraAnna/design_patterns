package coffeemaker;

import coffee.Coffee;
import coffee.Espresso;

public class EspressoMaker implements CoffeeMaker {
    public Coffee makeCoffee() {
        return new Espresso();
    };
}
