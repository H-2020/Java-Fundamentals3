package abstractor2;

public class SchoolApp {

    public static void main(String[] args) {

        Student student1 = new Student("Nikola", "Tesla", "java");
        Student student2 = new Student("Yilmaz", "Mustafa", "python");
        student1.setFirstName("Justin");
        student1.setLastName("Bieber");
        student1.setEmailName("justin@gmail.com");
        student1.changePassword("1234","1234","2345");
        student1.addScore(50);
        System.out.println(student1.getFirstName()+" "+student1.getLastName());

        Professor professor1 = new Professor("Marie", "Curie", "chemicals");

        Manager manager1 = new Manager("Pearl", "De Smet");

        Person.separator();

        student1.sendMessageToEveryone();
        student1.sendMessageToEveryone("Hello");
        student1.sendMessageToEveryone("Hello",5);

        Person.separator();

        professor1.sendMessageToEveryone();
        professor1.sendMessageToEveryone("Exam");
        professor1.sendMessageToEveryone("Exam",2);

        Person.separator();

        manager1.sendMessageToEveryone();
    }
}
