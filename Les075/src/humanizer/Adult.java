package humanizer;

public class Adult extends Person{

    private static int adultCounter;

    public Adult(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        adultCounter++;
    }

    public static int getAdultCounter(){
        return adultCounter;
    }
}
