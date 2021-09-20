package polyformismm;

public class ForestApp {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        System.out.println("Animal ID 1: " + animal1.getId());
        System.out.println("Animal ID 2: " + animal2.getId());
        System.out.println("Animal ID 3: " + animal3.getId());
        System.out.println("Animal ID 4: " + animal4.getId());

        System.out.println("Animal counter: " + Animal.getAnimalCounter());

    }
}
