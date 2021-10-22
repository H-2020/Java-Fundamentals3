package voorbeeldexamen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();


        list1.add("Akita");
        list1.add("Affenpinscher");
        list1.add("Belgian Malinois");
        list1.add("Bergamasco");
        list1.add("Pekingese");
        list1.add("Sivas Kangal");
        list1.add("Fino");
        list1.add("Sibirya wolf");
        list1.add("Duits wolf");
        list1.add("Cesky");

        for (int index = 0; index < list1.size(); index++) {
            System.out.println(list1.get(index));

        }

        Akita akita = new Akita("Akita",'M');
        SivasKangal sivasKangal = new SivasKangal("Sivas Kangal");
        akita.makeNoise();
        System.out.println(sivasKangal);


    }


}
