package inheritance;

public class Car extends RoadVehicle {

    public Car(long serialNo, String brand) {
        super(serialNo, brand);
    }

    public void print() {
        System.out.println("This is a car which we know nothing about the brand, price, and year");
    }
}
