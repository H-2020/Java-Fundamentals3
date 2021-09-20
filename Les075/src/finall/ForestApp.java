package finall;

public class ForestApp {

    public static void main(String[] args) {

        Cat cat = new Cat(2, true);
        System.out.println("Cat is alive: " + cat.isAlive());

        Dog dog = new Dog(5, false);
        System.out.println("Dog is alive: " + dog.isAlive());

        Pig pig = new Pig(4, true);
        System.out.println("Pig is alive: " + pig.isAlive());

        Cat cat2 = new Cat(3);
        System.out.println("Cat 2 is alive: " + cat2.isAlive());

    }

}
