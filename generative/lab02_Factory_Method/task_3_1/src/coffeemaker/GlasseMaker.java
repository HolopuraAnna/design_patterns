package coffeemaker;

import coffee.Coffee;
import coffee.Glasse;

public class GlasseMaker implements CoffeeMaker {
    public Coffee makeCoffee() {
        return new Glasse();
    };
}
