package inheritance;

public class Mercedes extends Car{


    public Mercedes(long serialNo, String brand) {
        super(serialNo, brand);
    }


    public void print(){

        System.out.println("This car is: " + super.getBrand() + ", serial no: " + super.getSerialNo());

    }
}
