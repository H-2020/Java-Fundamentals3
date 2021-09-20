package abstractor;

public class Professor extends Person{

    private String department;

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Professor(String firstName, String lastName, String department) {
        super(firstName, lastName);
        this.department=department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return this.department;
    }

    //METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryOne(String message) {
        System.out.println("Message from professor to everyone");

    }

    //METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryOne() {
        System.out.println("Message from professor to everyone");
    }

    //METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryOne(String message, int times) {
        System.out.println("Message from professor to everyone");

    }
}
