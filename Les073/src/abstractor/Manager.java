package abstractor;

public class Manager extends Person{
    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Manager(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    @Override
    public void sendMessageToEveryOne(String message) {

    }

    @Override
    public void sendMessageToEveryOne(String message, int times) {

    }


}
