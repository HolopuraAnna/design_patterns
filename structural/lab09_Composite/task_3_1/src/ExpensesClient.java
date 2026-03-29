public class ExpensesClient {

    public static void main(String[] args) {

        Manager director = new Manager("Director", 1000);

        Manager meatDept = new Manager("Meat Manager", 500);
        Manager dairyDept = new Manager("Dairy Manager", 500);
        Manager sweetsDept = new Manager("Sweets Manager", 500);

        director.add(meatDept);
        director.add(dairyDept);
        director.add(sweetsDept);

        meatDept.add(new Salesperson("Meat Worker 1", 200));
        meatDept.add(new Salesperson("Meat Worker 2", 200));
        meatDept.add(new Salesperson("Meat Worker 3", 200));

        dairyDept.add(new Salesperson("Dairy Worker 1", 180));
        dairyDept.add(new Salesperson("Dairy Worker 2", 180));
        dairyDept.add(new Salesperson("Dairy Worker 3", 180));

        sweetsDept.add(new Salesperson("Bakery Worker 1", 170));
        sweetsDept.add(new Salesperson("Bakery Worker 2", 170));
        sweetsDept.add(new Salesperson("Bakery Worker 3", 170));
        sweetsDept.add(new Salesperson("Bakery Worker 4", 170));


        System.out.println("Expenses have been requested\n");

        director.payExpenses();

        System.out.println("\nExpenses have been paid");
    }
}
