package integerr;

public class IntegerApp {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        System.out.println(numbers.getIntegerPrimitive());
        System.out.println(numbers.getIntegerAdvanced());

        Integer number1v1 = 10; // (autoboxing)
        // Integer number1v1 = new Integer(10);

        // DEPRECATED
        // Integer number1v5 = new Integer(10);

        Integer number1v2 = Integer.valueOf(10);
        Integer number1v3 = Integer.valueOf("10");

        int number1v4 = 10;

        System.out.println(number1v1);
        System.out.println(number1v2);
        System.out.println(number1v3);

        String SEPARATOR = "----------------------------------------";
        System.out.println(SEPARATOR);

        int comparisonResult = number1v1.compareTo(number1v2);
        boolean same = (number1v1 == number1v2);
        System.out.println("Comparison result = " + comparisonResult);
        System.out.println("Equals result = " + same);

        boolean same2 = (number1v2 == number1v3);
        System.out.println("Equals result = " + same2);

        boolean isPrimitiveSameAsAdvanced = (number1v1 == number1v4);
        System.out.println("Primitive equals to advanced = " + same2);

        // primitive do NOT extend Object
        // wrapper extends Object

        int numberParsed = Integer.parseInt("10");
        System.out.println("Parsed number from integer: " + numberParsed);



    }

}
