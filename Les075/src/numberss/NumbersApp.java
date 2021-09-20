package numberss;

public class NumbersApp {

    public static void main(String[] args) {

        Numbers numbers = new Numbers(100);
        System.out.println("Non-final, Non-static Number1:  " + numbers.number1);
        System.out.println("Final Number2:  " + numbers.number2);
        // System.out.println(numbers.number3);

        System.out.println("Static Number3:  " + Numbers.number3);

        System.out.println("Static counter    : " + Numbers.counter1);
        System.out.println("Non-static counter: " + numbers.counter2);

        Numbers anotherNumbers = new Numbers(10,20);
        Numbers someOtherNumbers = new Numbers(10,20);

        String SEPARATOR = "-------------------------------------------------------------";
        System.out.println(SEPARATOR);

        System.out.println("Static counter    : " + Numbers.counter1);
        System.out.println("Non-static counter: " + numbers.counter2);

    }
}
