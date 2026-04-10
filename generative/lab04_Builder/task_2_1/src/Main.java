public class Main {
    public static void main(String[] args) {
        /*
        Pizza pizza = new Pizza(
                "'Домашня проба'",
                new Dough(
                        Dough.DoughType.STANDARD,
                        Dough.Flour.CORNFLOUR,
                        40),
                new Topping(
                        Topping.ToppingType.CHEESE,
                        "Радомер",
                        20),
                new Topping(
                        Topping.ToppingType.SAUSAGES,
                        "мисливські",
                        30),
                new Topping(
                        Topping.ToppingType.OLIVES,
                        "оливки",
                        15)
        );


        System.out.println(pizza);
        */


        /*
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizzaDafault = pizzaBuilder
                .setName("My first pizza")
                .setDough(new Dough(Dough.DoughType.STANDARD, Dough.Flour.CORNFLOUR, 30))
                .addTopping(new Topping(Topping.ToppingType.CHEESE,"Радомер",20))
                .addTopping(new Topping(Topping.ToppingType.SAUSAGES,"мисливські",30))
                //.addTopping(new Topping(Topping.ToppingType.OLIVES,"оливки",15))
                .addTopping(new ToppingBuilder().setToppingName("оливки").setToppingType(Topping.ToppingType.OLIVES).setCost(15).build())
                .build();

        System.out.println(pizzaDafault);
        */

        Pizzaiolo pizzaiolo = new Pizzaiolo();

        Pizza texasPizza = pizzaiolo.getTexasPizza();
        System.out.println(texasPizza + "\n\n");

        Pizza hawaiPizza = pizzaiolo.getHawaiPizza();
        System.out.println(hawaiPizza + "\n\n");

        Pizza countryPizza = pizzaiolo.getCountryPizza();
        System.out.println(countryPizza + "\n\n");
    }
}