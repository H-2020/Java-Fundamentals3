package inheritance;

public class App {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle(1111L,"Mitsubishi");


        Car car1 = new Car(12345L, "Volvo");

        car1.print();

        Car car2 = new Car(14563L, "BMW");

        car2.print();

        Car car3 = new Car(1233L,"Mercedes");

        car3.print();

        Volvo car4=new Volvo(12365l,"Volvo");
        car4.print();


    }
}
