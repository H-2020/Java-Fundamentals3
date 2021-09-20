package abstractor2;

public class Manager extends Person{

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Manager(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message) {

    }

    @Override
    public void sendMessageToEveryone() {
        System.out.println("You have override");
    }

    // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message, int times) {

    }
}
