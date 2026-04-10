public class ToppingBuilder {

    private Topping.ToppingType toppingType = Topping.ToppingType.CHEESE;  // Тип добавки
    private String toppingName = "Радомер";    // Назва добавки
    private int cost = 30;               // Вартість добавки

    public ToppingBuilder setToppingType(Topping.ToppingType toppingType) {
        this.toppingType = toppingType;
        return this;
    }

    public ToppingBuilder setToppingName(String toppingName) {
        this.toppingName = toppingName;
        return this;
    }

    public ToppingBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }


    public Topping build(){
        return  new Topping(toppingType, toppingName, cost);
    }
}
