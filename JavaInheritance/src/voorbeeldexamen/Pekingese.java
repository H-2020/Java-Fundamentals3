package voorbeeldexamen;

public class Pekingese extends HomelyDog{

    private double hairLength;

    public Pekingese(String name) {
        super(name);
    }

    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }
    public void  play(){

    }
}
