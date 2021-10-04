package array_lists;

import java.util.*;

public class SimpleApp {

    public static void main(String[] args) {
        // RULE to create a collection from any type
        // CollectionName<DataTypeOfEachElement> instanceName = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        // ADD_NEW_ELEMENT
        list1.add("Yilmaz Mustafa");
        list1.add("Justin Bieber");
        list1.add("Nikola Tesla");
        list1.add("Marie Curie");
        list1.add("Irina Afannassenko");

        // UPDATE_OR_SET_ELEMENT_FROM_A_CERTAIN_INDEX
//        list1.set(1, "Irina Afannassenko");
        // DANGEROUS IF YOU DONT KNOW HOW MANY ELEMENTS THERE ARE IN THE ARRAY
//        list1.set(6, "Jack Suttichai Chairatanangamtaj");
//        list1.set(10, "Nino Gamtikulasivili");
//        list1.set(15, "Ali Jamal Alwasseti");
//        for (int index = 0; index < list1.size(); index++) {
//            System.out.println(list1.get(index));
//        }
        String SEPARATOR = "------------------------------------";
        System.out.println(SEPARATOR);

        System.out.println("Printing ArrayList<String>");

        // <parameterized datatype>
        Iterator<String> iterator = list1.iterator();
        // hasNext() checks if there is an element in the following index.
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(SEPARATOR);

//        System.out.println("Printing LinkedList<String>");
        LinkedList<String> list2 = new LinkedList<>();
        // ADD_NEW_ELEMENT
        list2.add("Yilmaz Mustafa");
        list2.add("Justin Bieber");
        list2.add("Nikola Tesla");
        list2.add("Marie Curie");
        list2.add("Irina Afannassenko");

//        // UPDATE_OR_SET_ELEMENT_FROM_A_CERTAIN_INDEX
//        list2.set(1, "Irina Afannassenko");
//        for(String fullName : list2){
//            System.out.println(fullName);
//        }
        Vector<String> list3 = new Vector<>();
        // ADD_NEW_ELEMENT
        list3.add("Yilmaz Mustafa");
        list3.add("Justin Bieber");
        list3.add("Nikola Tesla");
        list3.add("Marie Curie");
        list3.add("Irina Afannassenko");

        System.out.println(SEPARATOR);
//        System.out.println("Printing Vector<String>");
//        for(String fullName : list3){
//            System.out.println(fullName);
//        }
        ArrayDeque<String> queue1 = new ArrayDeque<>();

        PriorityQueue<String> queue2 = new PriorityQueue<>();

        HashSet<String> set1 = new HashSet<>();

        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        TreeSet<String> set3 = new TreeSet<>();

    }
}
