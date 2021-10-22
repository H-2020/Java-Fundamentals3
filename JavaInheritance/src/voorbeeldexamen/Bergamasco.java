package voorbeeldexamen;

public class Bergamasco extends HomelyDog{

    private int maxRunningSpeed;
    private double hairLengt;

    public Bergamasco(String name) {
        super(name);
    }

    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }
    public void kiss(){}
}
