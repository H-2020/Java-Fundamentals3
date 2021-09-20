package be.intecbrussel.students.hilal.Les067;

public class App {

    public static void main(String[] args) {
        Printer.welcome();
        Printer.calculation('+',Calculator.sum(Reader.readNumber(),50));
        Printer.separator();
        Printer.calculation('+',Calculator.sum(70,80));
    }
}
