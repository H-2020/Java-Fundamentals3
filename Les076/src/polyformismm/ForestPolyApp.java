package polyformismm;

public class ForestPolyApp {

    public static void main(String[] args) {

        // old school way of creating a new instance.
        // ClassName variableName = new ClassName();
        Dog dog1 = new Dog();
        Pig pig1 = new Pig();
        Elephant elephant1 = new Elephant();
        Mouse mouse1 = new Mouse();
        Wolf wolf1 = new Wolf();
        Human human1 = new Human();
        
        dog1.makeSound();
        System.out.println("Is dog1 aggressive: " + dog1.isAggressive());
        pig1.makeSound();
        elephant1.makeSound();
        mouse1.makeSound();
        mouse1.eatCheese(); // mouse specific
        wolf1.makeSound();
        human1.makeSound();

        String SEPARATOR = "----------------------------------------";
        System.out.println(SEPARATOR);

        // polymorphic syntax
        // SuperClass variableName = new SubClass();
        Animal dog2 = new Dog();
        Animal pig2 = new Pig();
        Animal elephant2 = new Elephant();
        Animal mouse2 = new Mouse(); // it is not a real instance of a mouse
        Animal wolf2 = new Wolf();
        Animal human2 = new Human();

        dog2.makeSound();
        // dog2.isAggressive();
        pig2.makeSound();
        elephant2.makeSound();
        mouse2.makeSound();
        // mouse2.eatCheese();
        wolf2.makeSound();
        human2.makeSound();

    }
}
