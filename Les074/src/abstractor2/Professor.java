package abstractor2;

public class Professor extends Person {

    private String department;

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Professor(String firstName, String lastName, String department) {
        super(firstName, lastName);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message) {
        System.out.println(message+" message from Professor");
    }

    @Override
    public void sendMessageToEveryone() {
        System.out.println("You have override");
    }


    // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message, int times) {
        System.out.println(times+ " times "+ message +" message from Professor");

    }

}
