public class Currency {

    private final String code;

    // THESE 3 INSTANCES ARE CREATED FROM THIS CLASS REFERENCE
    public static final Currency EUR = new Currency("EUR");
    public static final Currency USD = new Currency("USD");
    public static final Currency JPY = new Currency("JPY");

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    // METHOD_OVERRIDE_FROM_OBJECT
    public boolean equals(Object obj) {
        Currency otherCurrency = (Currency) obj;
        if (this.getCode().equalsIgnoreCase(otherCurrency.getCode())) {
            return true;
        } else {
            return false;
        }
    }
}
