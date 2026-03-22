package coffeemaker;

import coffee.Americano;
import coffee.Coffee;

public class AmericanoMaker implements CoffeeMaker {
    public Coffee makeCoffee() {
        return new Americano();
    };
}
