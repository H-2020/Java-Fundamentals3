public class Printer2 {
    public static void welcome() {
        System.out.println("Welcome to Chef's App");
    }

    public static void welcome(String text) {
        System.out.println("Your Text is:" + text);
    }

    public static void welcome(int index, String text) {
        for (int i = 0; i < index; i++) {
            System.out.println(index + text);
        }
    }

    // TODO: create 2 methods which overloads welcome method
    //  - String message param
    //  - with you own choice

}
