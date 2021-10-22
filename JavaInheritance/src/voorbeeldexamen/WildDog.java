package voorbeeldexamen;

public class WildDog extends Dog{

    private char size='L';

    public WildDog(String name) {
        super(name);
    }

    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }

    public void bark(int times){

    }
    public void hunt(){

    }
}
