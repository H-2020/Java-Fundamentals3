package humanizer;

public class HumanizerApp {

    public static void main(String[] args) {

        System.out.println("There are " + Person.getPersonCounter() + " people in this app.");

        Baby baby1 = new Baby(1, "Justin", "Bieber");
        Baby baby2 = new Baby(2, "Nikola", "Tesla");
        baby1.setId(456);
        baby2.setId(852);
        System.out.println("There are " + Baby.getBabyCounter() + " babies in this app.");

        System.out.println("There are " + Person.getPersonCounter() + " people in this app.");

        Adult adult1 = new Adult(695, "Marie", "Curie");
        System.out.println("There are " + Adult.getAdultCounter() + " adults in this app.");

        System.out.println("There are " + Person.getPersonCounter() + " people in this app.");

        String SEPARATOR = "----------------------------------------";
        System.out.println(SEPARATOR);

        baby1.sayFinalWords();
        adult1.sayFinalWords();

    }
}
