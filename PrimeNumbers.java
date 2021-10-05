package be.student.intecbrussel.hilal;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean primeNumber = false;
        while (!primeNumber) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number == 0 || number == 1) {
                System.out.println("Not prime number");
            } else if (number == 2 || number == 3 || number == 5 || number == 7) {
                System.out.println("Prime number");
                primeNumber = true;
            } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                System.out.println("Not prime number");
            } else {
                System.out.println("Prime number");
                primeNumber = true;
            }
        }
    }
}
