public class RaiseSalaryVisitor implements EmployeeVisitor {

    private final double percent;

    public RaiseSalaryVisitor(double percent) {
        this.percent = percent;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(
                (int)(manager.getSalary() * (1 + percent / 100))
        );
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(
                (int)(salesPerson.getSalary() * (1 + percent / 100))
        );
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary(
                (int)(itSupport.getSalary() * (1 + percent / 100))
        );
    }
}
