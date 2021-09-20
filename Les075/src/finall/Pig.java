package finall;

public class Pig extends Animal{

    public Pig(int age, boolean alive) {
        super(age, alive);
    }

    // METHOD_OVERRIDE_FROM_ANIMAL
    public void makeNoise() {
        System.out.println("wee wee");
    }
}
