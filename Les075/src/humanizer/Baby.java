package humanizer;

public class Baby extends Person{

    private static int babyCounter;

    public Baby(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        babyCounter++;
    }

    // METHOD_OVERRIDE_FROM_PERSON
    public static int getBabyCounter() {
        return babyCounter;
    }
}
