package calculator;

public class App {

    /* numbers must always be positive.  */
    public static void main(String[] args) {

            Calculator calculator1 = new Calculator(0, 0);
            calculator1.setNumber1(10);
            calculator1.setNumber2(20);

            System.out.println("Sum C1  : " + calculator1.sum());

           // Calculator calculator2 = new Calculator(15, Math.PI);

           // Calculator calculator3 = new Calculator(-100, 100);

        // error message
        // stop application
        System.out.println("Sum C1  : " + calculator1.sum());
        System.out.println("Min C1  : " + calculator1.min());
        System.out.println("Mul C1  : " + calculator1.mul());
        System.out.println("Div C1  : " + calculator1.div());

        System.out.println("There are " + Calculator.numberOfCalculation + " calculations in total.");


    }

}

