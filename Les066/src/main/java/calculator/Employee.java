package calculator;

public class Employee {
    // fields
    private int id; // getId() setId()
    private String firstName; // getFirstName() setFirstName()
    private String lastName;
    private String nickName;
    private long ipAddress;
    private String linkedInURL;
    private boolean isEmployed;
    private int postcode;
    private char gender;
    private String password;

    // constructors
    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName, long ipAddress, String linkedInURL) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ipAddress = ipAddress;
        this.linkedInURL = linkedInURL;
    }

    // method
    private void doSthPrivate(){
        System.out.println("I am working only in this class.");
    }

    //    public String getPassword() {
//        String encryptedPassword = "***************";
//        return encryptedPassword;
//    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public long getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(long ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLinkedInURL() {
        return this.linkedInURL;
    }

    public void setLinkedInURL(String linkedInURL) {
        this.linkedInURL = linkedInURL;
    }

    public boolean isEmployed() {
        return this.isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public int getPostcode() {
        return this.postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
