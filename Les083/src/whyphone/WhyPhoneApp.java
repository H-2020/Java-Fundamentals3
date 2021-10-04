package whyphone;

public class WhyPhoneApp {

    public static void main(String[] args) {


        WhyPhone phone = new WhyPhone(900.00, "Iphone", "Light-Blue");

        phone.locate(123,245);
        phone.startCall();
        phone.endCall();
        phone.shootAPhoto();
        phone.changeChannel();




    }

    public void showSpecs(SmartPhone phone){



    }
}
