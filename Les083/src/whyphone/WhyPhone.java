package whyphone;

public class WhyPhone extends SmartPhone {

    private final String color;


    public WhyPhone(double price, String brand, String color) {
        super(price, brand);
        this.color = color;
    }

   public String getColor() {

        return color;
   }
}
