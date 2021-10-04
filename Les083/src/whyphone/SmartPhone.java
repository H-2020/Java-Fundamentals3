package whyphone;

public class SmartPhone implements IRadio ,ISimCard, IWifi, ICamera, IGps {

    //Fields
    private final double price;
    private final String brand;

    public SmartPhone(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    //Methods
    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }



    //Method_override_from_ICamera
    public double shootAPhoto() {
        return 0;
    }

    //Method_override_from_ICamera
    public String[] viewPhotos() {
        return new String[0];
    }

    //Method_override_from_IGps
    public String locate(double latitude, double longtitude) {
        return "London";
    }

    //Method_override_from_IGps
    public void navigate() {

    }

    //Method_override_from_IRadio
    public double playChannel() {
        return 0;
    }

    //Method_override_from_IRadio
    public double changeChannel() {
        return 0;
    }

    //Method_override_from_ISimCard
    public String startCall() {

        return null;
    }

    //Method_override_from_ISimCard
    public void endCall() {

    }

    //Method_override_from_IWifi
    public String connect() {
        return null;
    }

    //Method_override_from_IWifi
    public String disconnect() {
        return null;
    }
}
