package castings;

public class CastingApp {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Justin", 4);
        System.out.println(cat1.getNickname());
        Cat cat2 = new Cat("Justin", 6);
        System.out.println(cat2.getNickname());

        Dog dog1 = new Dog("Donald");
        System.out.println(dog1.getNickname());
        Dog dog2 = new Dog("Trump");
        System.out.println(dog2.getNickname());

//        boolean areCatNamesSame = (cat1.getNickname().equals(cat2.getNickname()));
//        boolean areCatAgesSame = (cat1.getAge().equals(cat2.getAge()));
//        boolean areDogNicknamesSame = (dog1.getNickname().equals(dog2.getNickname()));
//        boolean areDogAgesSame = (dog1.getAge().equals(dog2.getAge()));
//        boolean areCatSame = (areCatNamesSame && areCatAgesSame);
//        boolean areDogsSame = (areDogNicknamesSame && areDogAgesSame);

        boolean areCatsSameV2 = cat1.equals(cat2);
        System.out.println("cat1.equals(cat2)" + areCatsSameV2);

//        System.out.println(cat1.getThis()); // the same thing, they will both access to the same instance
//        System.out.println(cat1); // the same thing, they will both access to the same instance

        Animal[] animals = {
                cat1, cat2, dog1, dog2
        };


        printAllAnimals(animals);

        boolean comparison1 = (cat1.equals(cat2));
        System.out.println("cat1.equals(cat2) -> " + comparison1);

    }

    public static void printAllAnimals(Animal[] animals) {
        // shortcut in intellij 'animals.fori' and 1st enter -> changeName -> 2nd enter
        for (int index = 0; index < animals.length; index++) {
            System.out.println(animals[index]);
        }
    }
}
