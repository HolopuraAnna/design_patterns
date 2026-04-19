public class Equation {
    enum Operation {
        ADD,
        MULTIPLY,
        SUBTRACT,
        DIVIDE,
        PERCENT,
    }


    private final Double num1;
    private final Double num2;
    private final Operation operation;
    private String stringOperation;
    private Double solution;


    public Operation getOperation() {
        return operation;
    }

    public Double getNum1(){ return num1; }
    public Double getNum2(){ return num2; }

    public void setSolution(Double solution) { this.solution = solution; }

    public void setStringOperation(String stringOperation) { this.stringOperation = stringOperation; }

    public Equation(Double num1, Double num2, Operation operation) {
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString(){
        return num1.toString() + " " +
                stringOperation + " " +
                num2.toString() + " " +
                "= " +
                solution.toString();
    }
}