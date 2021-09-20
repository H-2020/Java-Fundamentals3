package inheritance;

public class Volvo extends Car{
    public Volvo(long serialNo, String brand) {
        super(serialNo, brand);
    }

    public  void print(){

        System.out.println("This car is:  " + super.getBrand() + ", serial no: " + super.getSerialNo());

    }
}
