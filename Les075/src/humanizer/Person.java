package humanizer;

public abstract class Person {

    // class level field, final field
    // final -> give a value ONLY ONLY once !
    private static final String planet = "EARTH";

    private static int personCounter; // <<static>>

    private int id;

    // final: final status for a field
    private final String firstName;  // <<final>>
    private final String lastName; // <<final>>

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        personCounter++;
    }

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        personCounter++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    // RULE: if you mark a field static, getter must also be static.
    public static int getPersonCounter() {
        return personCounter;
    }

    public static String getPlanet(){
        return planet;
    }

    // NOT_OVERRIDDABLE
    // RULE: if you want to disable overriding for a certain method, use final
    public final void sayFinalWords() {
        System.out.println(this.firstName + " " + this.lastName
                + " says in his/her final words: " + "may the peace be upon you!");
    }
}
