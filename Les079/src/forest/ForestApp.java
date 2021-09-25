package forest;

public class ForestApp {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Dandy");
        Animal animal2 = new Animal("Dandy");
        Animal animal3 = new Animal("Dandy", 4);
        Animal animal4 = new Animal("Dandy", 6);
        Animal animal5 = animal2; // cloning a variable from another

        // PRINT_ALL_ANIMALS
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal5);

        animal5.setAge(1);
        System.out.println(animal5);

        boolean comparison1 = (animal1 == animal2);
        System.out.println("comparison1: " + comparison1);

        boolean comparison2 = (animal1.equals(animal2));
        System.out.println("comparison2: " + comparison2);

        boolean comparison3 = (animal2.equals(animal5));
        System.out.println("comparison3: " + comparison3);

        boolean comparison4 = animal1.equals(animal2);

        // WHAT IS THE BEST ? OR CHEFS STYLE ??


    }

}
