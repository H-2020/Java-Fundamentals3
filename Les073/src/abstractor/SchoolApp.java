package abstractor;

public class SchoolApp {

    public static void main(String[] args) {

        Student student1=new Student("Nikola","Tesla","java");
        Student student2=new Student("Yilmaz","Mustaf","java");

        Professor professor1=new Professor("Marie","Cruie","chemicals");

        Manager manager1=new Manager("Pearl","De Smet");
        student1.sendMessageToEveryOne();
        professor1.sendMessageToEveryOne();
        manager1.sendMessageToEveryOne();



    }
}
