import java.util.Scanner;

public class Reader {
    public static String readText(){

        // PRINT -> enter a number:
        System.out.print("Enter a text: ");

        // CREATE -> scanner
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        return text;
    }

    public static double readNumber(){

        // PRINT -> enter a number:
        System.out.print("Enter a number: ");

        // CREATE -> scanner
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        // SCANNER_NEW_LINE
        scanner.nextLine();

        return number;
    }


    public static int readAge(){
        System.out.println("Enter age: ");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        return age;
    }













}
