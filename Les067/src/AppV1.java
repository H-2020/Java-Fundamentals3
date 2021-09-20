public class AppV1 {
    // RULE_METHOD:
    /* een methode is een code-block dat ALLEEN wordt uitgevoerd asls het wordt aangeroepen */
    /* a method is run only if it is called */
    // RULE: if you want to call a method in a static method, you need to mark the method also static
    public static void main(String[] args) {

        //double number1 = Reader.readNumber(); // will be read from scanner
        //double number2 = Reader.readNumber(); // will be read from scanner
//        double number3 = Reader.readNumber(); // will be read from scanner
//        double number4 = 50;
//        double number5 = number4; // 50
//        double number6 = Reader.readNumber(); // will be read from scanner

        Printer.welcome();

        double sumResult = Calculator.sum(Reader.readNumber(), Reader.readNumber());
        double minResult = Calculator.min(Reader.readNumber(), Reader.readNumber());
        double mulResult = Calculator.mul(Reader.readNumber(), Reader.readNumber());
        double divResult = Calculator.div(Reader.readNumber(), Reader.readNumber());

        Printer.calculation('+', sumResult);
        Printer.separator();
        Printer.calculation('-', minResult);
        Printer.separator();
        Printer.calculation('x', mulResult);
        Printer.separator();
        Printer.calculation('/', divResult);
        Printer.separator();

        Printer.goodbye();

    }


}
