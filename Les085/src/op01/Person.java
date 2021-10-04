package op01;

public class Person {

    int age;
    String firstName;
    String lastName;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
    // METHOD_OVERRIDE_FROM_OBJECT
    public boolean equals(Object obj) {
        Person otherPerson = (Person) obj;
        boolean firstNamesSame = this.getFirstName().equalsIgnoreCase(otherPerson.getFirstName());
        boolean lastNamesSame = this.getLastName().equalsIgnoreCase(otherPerson.getLastName());
        return (firstNamesSame && lastNamesSame);
    }
     */


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return getLastName() != null ? getLastName().equals(person.getLastName()) : person.getLastName() == null;
    }


    public int hashCode() {
        int result = getAge();
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        return result;
    }

    /*
    // METHOD_OVERRIDE_FROM_COMPARABLE
    // method signature -> int, compareTo(), Person
    public int compareTo(Person otherPerson) {

    }
     */


}
