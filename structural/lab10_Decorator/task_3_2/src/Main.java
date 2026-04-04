public class Main {

    public static void main(String[] args) {

        // Еспресо з двома порціями цукру.
        Beverage drink1 = new Espresso();
        drink1 = new SugarDecorator(drink1);
        drink1 = new SugarDecorator(drink1);
        System.out.println(drink1);

        // Чорну каву з вершками та двома порціями цукру.
        Beverage drink2 = new DarkRoast();
        drink2 = new WhippedCreamDecorator(drink2);
        drink2 = new SugarDecorator(drink2);
        drink2 = new SugarDecorator(drink2);
        System.out.println(drink2);

        // Чорну каву з кремом та порцією цукру.
        Beverage drink3 = new DarkRoast();
        drink3 = new CreamDecorator(drink3);
        drink3 = new SugarDecorator(drink3);
        System.out.println(drink3);

        // Кава без кофеїну з молоком та двома порціями цукру.
        Beverage drink4 = new Decaf();
        drink4 = new MilkDecorator(drink4);
        drink4 = new SugarDecorator(drink4);
        drink4 = new SugarDecorator(drink4);
        System.out.println(drink4);
    }
}