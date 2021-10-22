package voorbeeldexamen;

import java.util.Arrays;

public class SivasKangal extends Dog {

    private String[] commands = {"brave", "strong", "loyal"};

    public SivasKangal(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Hav hav");

    }

    public void dangerous() {
        System.out.println("He can be dangerous");
    }


    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Sivas Kangal is a " + Arrays.toString(commands)+ " dog";
    }
}
