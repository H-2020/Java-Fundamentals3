package inheritance;

public class Vehicle {

    private long serialNo; //mandatory
    private String brand; //mandatory
    private double price; //optional
    private int year;

    public Vehicle(long serialNo,String brand){
        this.serialNo=serialNo;
        this.brand=brand;
    }
    public void setSerialNo(long serialNo){

        this.serialNo=serialNo;
    }
    public long getSerialNo(){

        return this.serialNo;
    }

    public void setBrand(String brand){

        this.brand=brand;
    }
    public String getBrand(){

        return this.brand;
    }

}
