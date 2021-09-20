public class App1 {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;

        double result1 = Calculator.sum(i1, i2);
        System.out.println("Sum of 2 integers = " + result1);

        double d1 = 30.00;
        double d2 = 40.00;

        double result2 = Calculator.sum(d1, d2);
        System.out.println("Sum of 2 doubles = " + result2);

        float f1 = 50.00F;
        float f2 = 60.00F;

        long l1 = 80L;
        long l2 = 90L;

        Calculator.sum(i1, i2);
        Calculator.sum(d1, d2);
        Calculator.sum(f1, f2);
        Calculator.sum(l1, l2);

        System.out.println(10);

        Printer2.welcome();
        Printer2.welcome("Welcome");
        Printer2.welcome(5," Welcome");
        Printer2.welcome();


    }
}

