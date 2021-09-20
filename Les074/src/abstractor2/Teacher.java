package abstractor2;

public class Teacher extends Person{

    private String department;

    public Teacher(String firstName, String lastName,String department) {
        super(firstName, lastName);
        this.department=department;
    }

    // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message) {

    }


    // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message, int times) {

    }
}
