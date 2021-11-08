package be.intecbrussel.notebook.entities.plant_entities;

public class Flower extends APlant {

    //FIELDS
    private Scent smell;

    //CONSTRUCTORS

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, Double height) {
        super(name,height);

    }

    public Flower(String name, Double height, Scent smell) {
        super(name, height);
        this.smell = smell;
    }

    //METHODS

    public Scent getSmell() {
        return this.smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Flower smells: " + this.smell ;
    }
}
