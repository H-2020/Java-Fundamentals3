package array_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ComparingLists {
    public static void main(String[] args) {
        // EXAM
        ArrayList<String> list1 = new ArrayList<>();
        // ADD_NEW_ELEMENT
        list1.add("Yilmaz");
        list1.add("Justin");
        list1.add("Nikola");
        list1.add("Marie");
        list1.add("Irina");

        list1.remove("Justin");
        list1.remove(3);

        // BEFORE_REVERSING_LIST
        System.out.println("-----------BEFORE REVERSING---------");
        
        for (String element : list1) {
            System.out.println(element);
        }
        // SORTING -> Collections (Utility Class)
        Collections.reverse(list1);

//        System.out.println(list1.get(3));
        System.out.println("-----------AFTER REVERSING---------");
        // AFTER_REVERSING_LIST
        for (String element : list1) {
            System.out.println(element);
        }
        // EXAM
        Collections.shuffle(list1);

        System.out.println("-------------------------------------");

        LinkedList<String> list2 = new LinkedList<>();
        // ADD_NEW_ELEMENT
        list2.add("Yilmaz");
        list2.add("Justin");
        list2.add("Nikola");
        list2.add("Marie");
        list2.add("Irina");

        list2.remove("Justin");
        list2.remove(3);

        for (int index = 0; index < list2.size(); index++) {
            System.out.println(list2.get(index));
        }
    }
}