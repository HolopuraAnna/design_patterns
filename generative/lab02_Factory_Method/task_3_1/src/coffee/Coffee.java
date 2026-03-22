package coffee;

public interface Coffee {
    double getCost();

    double getPrice();

    default double getProfit() {
        return getPrice() - getCost();
    }

    String getName();
}
