package pizzaa;

public class PizzaApp {

    public static void main(String[] args) {

        Pizza margheritta = new Pizza();
        margheritta.setTitle("Pizza Margheritta");
        margheritta.setPrice(12);
        margheritta.setSize('M');

        Pizza hawai = new Pizza();
        hawai.setTitle("Pizza Hawai");
        hawai.setPrice(15);
        hawai.setSize('L');

        Pizza salmon = new Pizza();
        salmon.setTitle("Pizza Salmon");
        salmon.setPrice(20);
        salmon.setSize('S');

        Pizza kebab = new Pizza();
        kebab.setTitle("Pizza Kebab");
        // missing size info
        // missing price info
//        kebab.setSize('X');
        kebab.setPrice(30);

        System.out.println("Welcome to Pizzify.");
        if(margheritta.getPrice() != null){
            System.out.println("1. " + margheritta.getTitle() + " = " + margheritta.getPrice() + " €");
        }

        if(hawai.getPrice() != null){
            System.out.println("2. " + hawai.getTitle() + " = " + hawai.getPrice() + " €");
        }

        if(salmon.getPrice() != null){
            System.out.println("3. " + salmon.getTitle() + " = " + salmon.getPrice() + " €");
        }

        if(kebab.getPrice() != null){
            System.out.println("4. " + kebab.getTitle() + " = " + kebab.getPrice() + " €");
        }

        Pizza[] pizzas = {
                margheritta, hawai, salmon, kebab
        };

        // CALCULATE_TOTAL_PRICE
        double sum = 0;
        for (int index = 0; index < pizzas.length; index++) {
            sum = sum + pizzas[index].getPrice();
        }

        System.out.println("Total pricce: " + sum + " €");

    }
}
