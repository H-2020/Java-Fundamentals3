package op01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareApp {

    public static void main(String[] args) {

        Person person1 = new Person("Justin", "Timberlake", 30);
        Person person2 = new Person("Justin", "Bieber", 30);
        Person person3 = new Person("Justin", "Bieber", 35);
        Person person4 = new Person("Nikola", "Tesla", 30);
        Person person5 = new Person("Elon", "Tesla", 30);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        // FIRST AND BAD OPTION
        // boolean firstNamesSame = person1.getFirstName().equalsIgnoreCase(person2.getFirstName());
        // boolean lastNamesSame = person1.getLastName().equalsIgnoreCase(person2.getLastName());
        // boolean areTheySame = firstNamesSame && lastNamesSame;

        // System.out.println(person1.equals(person2));
        // System.out.println(person2.equals(person1));
        // System.out.println(person2.equals(person3));

        System.out.println(person1);
        System.out.println(person2);

        System.out.println( person1 == person2 );
        System.out.println(person1.equals(person2));
        // compare with
        System.out.println(person2.equals(person3));




    }

}
