public class CurrencyApp {

    public static void main(String[] args) {

        // CHECK IF FIRST AND SECOND CURRENCY ARE EQUAL

        Currency eur = new Currency("EUR");
        Currency usd = new Currency("USD");
        Currency jpy = new Currency("JPY");

        boolean areTheySame = eur.equals(usd);

        System.out.println(areTheySame);

    }

}
