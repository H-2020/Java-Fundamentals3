package numberss;

public class Numbers {

    static int counter1; // class level variable
    int counter2;

    int number1; // default value is 0

    final int number2; // no default value

    static int number3; // class level variable

    public Numbers(int number2) {
        this.number2 = number2;
        counter1++;
        counter2++;
    }

    public Numbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        counter1++;
        counter2++;
    }
}
