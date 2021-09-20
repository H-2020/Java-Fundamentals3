package calculator;

public class Calculator {

    // RULE_Y set all static variables public
    public static int numberOfCalculation;

    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    public void setNumber1(double number1) {
        if (number1 < 0) {
            System.out.println("Sorry only positive numbers ");
            System.exit(-1);
        } else {
            this.number1 = number1;
        }

    }

    public void setNumber2(double number2) {
        if (number2 < 0) {
            System.out.println("Sorry only positive numbers ");
            System.exit(-1);
        } else {
            this.number2 = number2;
        }
    }

    public double sum() {
        numberOfCalculation++;
        return (this.number1 + this.number2);
    }

    public double min() {
        numberOfCalculation++;
        return (this.number1 - this.number2);
    }

    public double mul() {
        numberOfCalculation++;
        return (this.number1 * this.number2);
    }

    public double div() {
        numberOfCalculation++;
        return (this.number1 / this.number2);
    }
}
