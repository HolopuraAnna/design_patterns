public class Pizzaiolo {

    public Pizza getHawaiPizza(){
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        DoughBuilder doughBuilder = new DoughBuilder();
        ToppingBuilder toppingBuilder = new ToppingBuilder();

        Dough dough = doughBuilder
                .setDoughType(Dough.DoughType.THICK)
                .setFlour(Dough.Flour.CORNFLOUR)
                .setCost(30)
                .build();

        return pizzaBuilder
                .setName("Hawai")
                .setDough(dough)
                .addTopping(toppingBuilder
                        .setToppingType(Topping.ToppingType.CHEESE)
                        .setToppingName("Радомер")
                        .setCost(20)
                        .build())
                .addTopping(toppingBuilder
                        .setToppingType(Topping.ToppingType.SAUSAGES)
                        .setToppingName("мисливські")
                        .setCost(30)
                        .build())
                .build();
    }

    public Pizza getTexasPizza(){
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        DoughBuilder doughBuilder = new DoughBuilder();
        ToppingBuilder toppingBuilder = new ToppingBuilder();

        Dough dough = doughBuilder
                .setDoughType(Dough.DoughType.THICK)
                .setFlour(Dough.Flour.CORNFLOUR)
                .setCost(30)
                        .build();

        return pizzaBuilder
                .setName("Texas")
                .setDough(dough)
                .addTopping(toppingBuilder
                        .setToppingType(Topping.ToppingType.CHEESE)
                        .setToppingName("Радомер")
                        .setCost(20)
                        .build())
                .build();
    }

    public Pizza getCountryPizza(){
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        DoughBuilder doughBuilder = new DoughBuilder();
        ToppingBuilder toppingBuilder = new ToppingBuilder();

        Dough dough = doughBuilder
                .setDoughType(Dough.DoughType.THICK)
                .setFlour(Dough.Flour.CORNFLOUR)
                .setCost(30)
                .build();

        return pizzaBuilder
                .setName("Country")
                .setDough(dough)
                .addTopping(toppingBuilder
                        .setToppingType(Topping.ToppingType.CHEESE)
                        .setToppingName("Радомер")
                        .setCost(20)
                        .build())
                .addTopping(toppingBuilder
                        .setToppingType(Topping.ToppingType.OLIVES)
                        .setToppingName("оливки")
                        .setCost(15)
                        .build())
                .build();
    }
}
