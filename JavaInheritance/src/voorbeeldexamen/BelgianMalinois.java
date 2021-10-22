package voorbeeldexamen;

public class BelgianMalinois extends WildDog {

    private boolean dangerous;
    private double maxRunningSpeed;

    public BelgianMalinois(String name) {
        super(name);
    }

    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }

    public void defend(){}
    public void attack(){}
}
