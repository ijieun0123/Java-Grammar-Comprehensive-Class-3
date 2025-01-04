import java.util.Objects;

public class Calculator {
    AbstractOperation operation;

    public Calculator (AbstractOperation abstractOperation){
        this.operation = abstractOperation;
    }

    double calculate(int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}
