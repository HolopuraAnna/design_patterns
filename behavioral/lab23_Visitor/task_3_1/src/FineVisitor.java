public class FineVisitor implements EmployeeVisitor {

    private final int fine;

    public FineVisitor(int fine) {
        this.fine = fine;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(
                Math.max(0, manager.getSalary() - fine)
        );
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(
                Math.max(0, salesPerson.getSalary() - fine)
        );
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary(
                Math.max(0, itSupport.getSalary() - fine)
        );
    }
}
