import java.util.Scanner;

public class MethodsExercise1 {

    public static void main(String[] args) {
        System.out.print("Enter your name and age:");
        System.out.println(getName()+" "+getAge());

    }

    public static String getName(){
        Scanner scanner= new Scanner(System.in);
        String name=scanner.nextLine();
        return name;
    }

    public static double getAge(){
        return new Scanner(System.in).nextDouble();
    }

}
