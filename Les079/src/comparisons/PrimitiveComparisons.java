package comparisons;

public class PrimitiveComparisons {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 10;

        boolean numbersSame = (number1 == number2);
        System.out.println(numbersSame);

        char character1 = 'X';
        char character2 = 'x';

        boolean charsSame = (character1 == character2);
        System.out.println(charsSame);

        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = new String("Hello");
        String text4 = text2;

        boolean textsSame = (text1 == text2);
        System.out.println("text1 == text2: " + textsSame);

        boolean texts1And3Same = (text1 == text3);
        System.out.println("text1 == text3: " + texts1And3Same);

        boolean text2And4Same = (text2 == text4);
        System.out.println("text2 == text4: " + text2And4Same);

        boolean texts1And3SameWithEquals = text1.equals(text3);
        System.out.println("Text 1 equals to 3: " + texts1And3SameWithEquals);

        Object object1 = new Object();
        Object object2 = new Object();

        boolean objectsSame = (object1 == object2);
        System.out.println(objectsSame);

    }

}
