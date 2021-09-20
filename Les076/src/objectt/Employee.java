package objectt;

// redundant operation extends Object
public class Employee{

    private static int employeeCounter;

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        employeeCounter++;
        this.id = employeeCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        String info = "Employee with ID: " + this.id + ", " + this.firstName + " " + this.lastName + "."
                + "\n" + "Employee's age is: " + this.age;
        return info;
    }
}
