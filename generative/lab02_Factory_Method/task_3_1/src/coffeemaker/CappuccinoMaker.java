package coffeemaker;

import coffee.Americano;
import coffee.Cappuccino;
import coffee.Coffee;

public class CappuccinoMaker implements CoffeeMaker{
    public Coffee makeCoffee() {
        return new Cappuccino();
    };
}
