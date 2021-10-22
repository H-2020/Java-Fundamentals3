package voorbeeldexamen;

public class Akita extends HomelyDog{

    private static int akitasCounter;
    private final char gender;

    public Akita(String name,char gender) {
        super(name);
        this.gender=gender;
        akitasCounter++;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='F'){
            super.setSize('M');
            this.gender = gender;
        }else{
            super.setSize('L');
            this.gender = gender;
        }

    }

    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }

    public void layDown(){}
    public void dance(){}
    public void sing(){}
    public void sit(){}

    public static int getAkitasCounter() {
        return akitasCounter;
    }
}
