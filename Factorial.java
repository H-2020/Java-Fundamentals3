package be.student.intecbrussel.hilal;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scanner.nextInt();
        scanner.nextLine();
        int sum=1;
        for(int index=1;index<=number;index++){
            sum=sum*index;
        }
        System.out.println("Factoriel "+ number+" is "+ sum);
    }
}
