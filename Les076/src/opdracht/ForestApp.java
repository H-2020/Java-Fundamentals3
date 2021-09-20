package opdracht;

public class ForestApp {

    public static void main(String[] args) {


        Animal dog1 = new Dog();
        dog1.setNickname("doky");
        Animal human1 = new Human();
        human1.setNickname("chef");
        Animal cat1 = new Cat();
        cat1.setNickname("kattapul");
        Animal elephant1 = new Elephant();
        elephant1.setNickname("lefanto");
        // YOU CAN ALWAYS CREATE AN ARRAY OF SUPER CLASS AND ADD ALL SUB-CLASSES AS ELEMENT
        Animal[] animals = {
                dog1, human1, cat1, elephant1
        };

        LogBook logBook = new LogBook(animals);
        logBook.printNickNamesOfAllAnimals();

        // WRONG CODING
        // Cat cat3 = new Animal();

        Animal dog3 = new Dog();


    }
}
