package integerr;

import java.math.BigDecimal;

public class BigDecimalApp {

    public static void main(String[] args) {

        //Calculator
        BigDecimal number1=new BigDecimal(10);
        BigDecimal number2=new BigDecimal(20);
        BigDecimal number3=new BigDecimal(30);
        BigDecimal number4=new BigDecimal(40);
        BigDecimal number5=new BigDecimal(50);

        BigDecimal sum=number1.add(number2);
        BigDecimal min=number1.subtract(number2);
        BigDecimal div=number1.divide(number2);
        BigDecimal mul=number1.multiply(number2);

        BigDecimal sumOfManyNumbers=number1.add(number2).add(number2).add(number3);

        BigDecimal complexCalculation=number1.add(number2).divide((number3).multiply(number4).min(number5));


        System.out.println(sum);
        System.out.println(min);
        System.out.println(div);
        System.out.println(mul);




    }
}
