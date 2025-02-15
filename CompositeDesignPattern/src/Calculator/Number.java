package Calculator;

public class Number implements ArithmeticExpression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public int evaluate() {
        System.out.println("Value of Number : " + this.number);
        return this.number;
    }
}
