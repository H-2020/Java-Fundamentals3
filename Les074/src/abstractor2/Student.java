package abstractor2;

public class Student extends Person {

    private String course;
    private double averageScore;

    public Student(String firstName, String lastname, String course) {
        super(firstName, lastname);
        this.course = course;
    }

    public void addScore(double score) {

    }

    public double getAverageScore() {
        return this.averageScore;
    }

    public String getCourse() {

        return this.course;
    }

    // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message) {
        System.out.println( message+" message from Student");

    }

       // METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryone(String message, int times) {
        System.out.println(times+ " times "+ message +" message from student");

    }
}
