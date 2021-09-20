package finall;

public class Cat extends Animal{

    public Cat(int age) {
        // this constructor will never give a value to alive
        super(age);
    }

    public Cat(int age, boolean alive) {
        super(age, alive);
    }

    // METHOD_OVERRIDE_FROM_ANIMAL
    public void makeNoise() {
        System.out.println("miauw miauw");
    }
}
