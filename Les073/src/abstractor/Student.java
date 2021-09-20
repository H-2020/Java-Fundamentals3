package abstractor;

public class Student extends Person{

    private String course;
    private double averageScore;

    public Student(String firstName, String lastName,String course) {
       super(firstName,lastName);
       this.course=course;
    }
    public void addScore(double score){

    }

    //METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryOne(String message) {
        System.out.println("Message from student to everyone");

    }

    //METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryOne() {
        System.out.println("Message from student to everyone");

    }

    //METHOD_OVERRIDE_FROM_PERSON
    public void sendMessageToEveryOne(String message, int times) {
        System.out.println("Message from student to everyone");
    }

    public double getAverageScore() {
        return this.averageScore;
    }
    public String getCourse() {
        return this.course;
    }
}
