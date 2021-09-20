package abstractor;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Address[] addresses ;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses=new Address[2];
    }

    public Person(String firstName, String lastName, String email) {
        this(firstName ,lastName);
        this.email = email;
    }

    public Person(String firstName, String lastName, String email, String password) {
        this(firstName ,lastName,email);
        this.password = password;
    }
    //ABSTRACT_METHOD
    public abstract void sendMessageToEveryOne(String message);
    //ABSTRACT_METHOD
    public  void sendMessageToEveryOne(){
        System.out.println("Message from person to everyone");
    }
    //ABSTRACT_METHOD
    public abstract void  sendMessageToEveryOne(String message, int times);

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void changePassword(String oldPassword,String oldPasswordRepeat,String newPassword){

    }
}
