package objectt;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Justin", "Bieber");
        Employee employee2 = new Employee("Nikola", "Tesla");
        Employee employee3 = new Employee("Marie", "Curie");

        Object object1 = new Object();

        Object employee4 = new Employee("Thomas", "Edison");

        Object text1 = new String("some text");

        Object scanner1 = new Scanner(System.in);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println(object1.toString());
        System.out.println(employee4.toString());

        System.out.println(text1.toString());
        System.out.println(scanner1);



    }
}
