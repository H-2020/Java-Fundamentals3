public class AppV2 {
    // RULE_METHOD:
    /* een methode is een code-block dat ALLEEN wordt uitgevoerd asls het wordt aangeroepen */
    /* a method is run only if it is called */
    // RULE: if you want to call a method in a static method, you need to mark the method also static
    public static void main(String[] args) {

       // double number1 = Reader.readNumber(); // will be read from scanner
       // double number2 = Reader.readNumber(); // will be read from scanner
        //double number3 = Reader.readNumber(); // will be read from scanner
        //double number4 = Reader.readNumber(); // will be read from scanner
       // double number5 = Reader.readNumber(); // will be read from scanner
       // double number6 = Reader.readNumber(); // will be read from scanner
        //double number7 = Reader.readNumber(); // will be read from scanner
        //double number8 = Reader.readNumber(); // will be read from scanner
//        double number3 = Reader.readNumber(); // will be read from scanner
//        double number4 = 50;
//        double number5 = number4; // 50
//        double number6 = Reader.readNumber(); // will be read from scanner
        Printer.welcome();

        //double sumResult = Calculator.sum(number1, number2);
        //double minResult = Calculator.min(number1, number2);
        //double mulResult = Calculator.mul(number1, number2);
        //double divResult = Calculator.div(number1, number2);

        Printer.calculation('+', Calculator.sum(Reader.readNumber(), Reader.readNumber()));
        Printer.separator();
        Printer.calculation('-', Calculator.min(Reader.readNumber(), Reader.readNumber()));
        Printer.separator();
        Printer.calculation('x', Calculator.mul(Reader.readNumber(), Reader.readNumber()));
        Printer.separator();
        Printer.calculation('/', Calculator.div(Reader.readNumber(), Reader.readNumber()));
        Printer.separator();

        Printer.goodbye();

    }

}
