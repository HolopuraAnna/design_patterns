public class Client {

    public static void main(String[] args) {

        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new ITSupport(45000));

        System.out.println(
                "Initial salary expenses: "
                        + staffList.getSalary());

        // Підвищення на 10%
        staffList.accept(new RaiseSalaryVisitor(10));

        System.out.println(
                "After raise: "
                        + staffList.getSalary());

        // Штраф 5000
        staffList.accept(new FineVisitor(5000));

        System.out.println(
                "After fine: "
                        + staffList.getSalary());
    }

}
