import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt();

        for(int i=0; i<=number;i++) {

            for (int j = 1; j <= number-i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }


        for(int i=0; i<=number;i++) {

            for (int j = 1; j <= number-i; j++)
                System.out.print(" ");

            for (int j = 1; j <=2*i-1; j++)
                System.out.print("*");

            System.out.println();
        }

    }
}
