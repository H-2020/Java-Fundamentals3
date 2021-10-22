package voorbeeldexamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Owner {


    public static void main(String[] args) {
        String ownerName;
        String familyName;

        Scanner scanner=new Scanner(System.in);

        ArrayList<String> dogs = new ArrayList<>();
        dogs.add("Akita");
        dogs.add("Affenpinscher");
        dogs.add("Belgian Malinois");
        dogs.add("Bergamasco");
        dogs.add("Pekingese");
        dogs.add("Sivas Kangal");
        dogs.add("Fino");
        dogs.add("Sibirya wolf");
        dogs.add("Duits wolf");
        dogs.add("Cesky");

        System.out.println("How many dogs do you want to adopter?");
        int numberOfAdopter=scanner.nextInt();
        scanner.nextLine();

        Collections.shuffle(dogs);
        System.out.println("Enter the name: ");
        ownerName=scanner.nextLine();
        System.out.println("Enter the lastname: ");
        familyName=scanner.nextLine();

        for (int index = 0; index < numberOfAdopter; index++) {

            System.out.println(ownerName+ " adopts "+ dogs.get(index));

        }

    }
}
