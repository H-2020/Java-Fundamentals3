package calculator;

import java.util.Scanner;

public class AppV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter [ total income SPACE number of employees ] ( 10 2 ):  ");
        // chef is the boss: 100_000€
        double totalIncome = scanner.nextDouble();
        // 25.50 employees
        double numberOfEmployees = scanner.nextDouble();
        // SCANNER_ISSUE
        scanner.nextLine();
        // PRINT -> add new line after reading numbers
        System.out.print("\n");
        Calculator salaryCalculator = new Calculator( totalIncome, numberOfEmployees );
        double averageSalary = salaryCalculator.div();
        System.out.println("Average salary is " + averageSalary);


          /* JAVA JOKE
        // averageSalary =
        double averagePromisedSalary = totalIncome / numberOfEmployees;
        double averageRealSalary = totalIncome / 25;
        */

    }


}
