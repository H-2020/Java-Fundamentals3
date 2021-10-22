package voorbeeldexamen;

public class HomelyDog extends Dog{

    private char size;
    private char coat;

    public HomelyDog(String name) {
        super(name);
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
}
