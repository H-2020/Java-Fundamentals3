import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt();

        for(int i=0; i<=number;i++) {

            for (int j = 1; j <= number-i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2*i-1; j++)
                if (i == number)
                    System.out.print("*");
                else
                    if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");



            System.out.println();
        }

    }
}
