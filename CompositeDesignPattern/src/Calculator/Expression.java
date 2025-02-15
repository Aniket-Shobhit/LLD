package Calculator;

public class Expression implements ArithmeticExpression {
    Operation operator;
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;

    public Expression(Operation operator, ArithmeticExpression leftExpression, ArithmeticExpression rightExpression) {
        this.operator = operator;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int evaluate() {
        int value = 0;
        switch(operator) {
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        System.out.println("Expression Value is : " + value);
        return value;
    }

}
