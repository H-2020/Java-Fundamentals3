package be.intecbrussel.notebook.entities.plant_entities;

public class Weed extends APlant{

    //FIELDS
    private double area;

    //CONSTRUCTORS

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double area) {
        super(name);
        this.area = area;
    }

    public Weed(String name, Double height, double area) {
        super(name, height);
        this.area = area;
    }

    //METHODS

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Weed's area=" + this.area ;
    }
}
