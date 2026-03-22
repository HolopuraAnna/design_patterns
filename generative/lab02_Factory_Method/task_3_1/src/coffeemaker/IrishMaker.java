package coffeemaker;

import coffee.Coffee;
import coffee.Irish;

public class IrishMaker implements CoffeeMaker {
    public Coffee makeCoffee() {
        return new Irish();
    };
}
