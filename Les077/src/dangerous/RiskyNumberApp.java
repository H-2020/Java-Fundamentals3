package dangerous;

public class RiskyNumberApp {

    public static void main(String[] args) {

        double number1 = 9.00;
        Double number2 = 652.00;

        System.out.println("Price 1: " + number1);
        System.out.println("Price 2: " + number2);

        double division = number1 / number2;
        System.out.println("Division of 2 numbers: " + division);

        double multiplicaiton = number1 * number2;
        System.out.println("Multiplication of 2 numbers: " + multiplicaiton);
    }

}
