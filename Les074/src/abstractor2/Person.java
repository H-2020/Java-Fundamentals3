package abstractor2;

// ABSTRACT: cannot create an instance of a Person
public abstract class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Address[] addresses;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = new Address[3];
    }

    public Person(String firstName, String lastName, String email) {
        this(firstName, lastName);
        this.email = email;
    }

    public Person(String firstName, String lastName, String email, String password) {
        this(firstName, lastName, email);
        this.password = password;
    }

    // access_modifier return_type method_name(params: data_type param_name, ....) {  }
    // access_modifier abstract return_type method_name(params: data_type param_name, ....);

    // ABSTRACT_METHOD
    public abstract void sendMessageToEveryone(String message);

    public  void sendMessageToEveryone(){
        System.out.println("Message Person");

    }
    // ABSTRACT_METHOD
    public abstract void sendMessageToEveryone(String message, int times);

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

    public String getEmailName() {
        return this.email;
    }

    public void setEmailName(String email) {
        this.email = email;
    }

    public void changePassword(String oldPassword, String oldPasswordRepeat, String newPassword){
        System.out.println("Your new password is: "+newPassword);

    }
    public static void separator(){
        System.out.println("***********************");
    }
}
