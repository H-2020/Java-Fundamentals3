package finall;

public class Dog extends Animal{

    public Dog(int age, boolean alive) {
        super(age, alive);
    }

    // METHOD_OVERRIDE_FROM_ANIMAL
    public void makeNoise() {
        System.out.println("bow how");
    }
}
