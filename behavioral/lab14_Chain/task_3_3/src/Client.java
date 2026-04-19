public class Client {
    public static void main(String[] args) {

        Equation[] equations = {
                new Equation(2.0, 3.4, Equation.Operation.ADD),
                new Equation(2.0, 3.4, Equation.Operation.MULTIPLY),
                new Equation(37.0, 19.0, Equation.Operation.SUBTRACT),
                new Equation(42.0, 6.0, Equation.Operation.DIVIDE),
                new Equation(50.0, 9.4, Equation.Operation.PERCENT),
        };

        Handler add = new AdditionHandler();
        Handler multiply = new MultiplicationHandler();
        Handler subtract = new SubtractionHandler();
        Handler divide = new DivisionHandler();
        Handler percent = new PercentHandler();

        add.setNext(multiply);
        multiply.setNext(subtract);
        subtract.setNext(divide);
        divide.setNext(percent);

        for (Equation equation : equations){
            add.solve(equation);
        }
    }
}
