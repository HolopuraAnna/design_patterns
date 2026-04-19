public class SubtractionHandler extends OperationHandler {

    @Override
    public void solve(Equation equation){
        Equation.Operation operation = equation.getOperation();
        Double num1 = equation.getNum1();
        Double num2 = equation.getNum2();

        if (Equation.Operation.SUBTRACT.equals(operation)) {
            equation.setStringOperation("-");
            equation.setSolution(num1 - num2);
            System.out.println(equation);

        }  else super.solve(equation);
    }
}
