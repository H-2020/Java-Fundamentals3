package be.student.intecbrussel.hilal;

public class ReverseANumber {

    public static void main(String[] args) {
        int number=1234;
        int reverse=0;
        int remainder=0;
        System.out.println("Number is: "+number);

        while(number!=0){
          remainder=number%10;
          reverse=(reverse*10)+remainder;
          number=number/10;
        }

        System.out.println("Reverse is: "+reverse);


        System.out.println("********************************");
        for( ;number != 0; number=number/10)
        {
            int remainder2 = number % 10;
            reverse = reverse * 10 + remainder2;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}

