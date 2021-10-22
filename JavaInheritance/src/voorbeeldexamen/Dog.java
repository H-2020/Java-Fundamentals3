package voorbeeldexamen;

public class Dog extends Wolf {

    private static int dogCounter;
    private char size;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }



    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }

    public void bark() {
        System.out.println("wow wow wow");

    }

    public void sit() {

    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
