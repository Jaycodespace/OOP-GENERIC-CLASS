package Arithmetic;

class Arithmetic<FirstNum extends Number, SecondNum extends Number> {
    private final FirstNum num1;
    private final SecondNum num2;

    public Arithmetic(FirstNum num1, SecondNum num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public double getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public double getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
