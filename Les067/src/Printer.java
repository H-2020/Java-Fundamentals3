public class Printer {
    // voor een method is gecreëerd,
    // vraag eerst: "hoeveel instanties van deze klas heb ik nodig" om in een andere klas te gebruiken?
    // static -> class method
    public static void calculation(char operation, double result) {
        System.out.println("Calculation: ");
        System.out.println("number1 " + operation + " number2 " + " = " + result);
    }

    // non-static -> instance method
    public static void welcome(){

        System.out.println("Welcome to Calculator");
    }

    public static void goodbye(){

        System.out.println("Thank you for choosing calculator app.");
    }

    public static void separator(){

        System.out.println("-----------------------------------------------");
    }

}
