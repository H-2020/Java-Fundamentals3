package be.student.intecbrussel.hilal;

public class Fibonacci {

    public static void main(String[] args) {
        int number1=0;
        int number2=1;
        int sum=0;
        System.out.println(number1+" "+number2);

        for(int index=0;index<10;index++){
            sum=number1+number2;
            System.out.println(" "+sum);
            number1=number2;
            number2=sum;


        }
    }
}
