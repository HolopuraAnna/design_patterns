import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private  String name = "Default";

    private  Dough dough = new Dough(Dough.DoughType.STANDARD,   //  Тісто
            Dough.Flour.WHEAT,
            20);
    private final List<Topping> toppings = new ArrayList<>();  // Добавки


    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder addTopping(Topping topping){
        toppings.add(topping);
        return this;
    }



    Pizza build(){
        return new Pizza(name, dough, toppings);
    }
}
