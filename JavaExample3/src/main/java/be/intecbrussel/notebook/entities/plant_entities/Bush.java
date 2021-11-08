package be.intecbrussel.notebook.entities.plant_entities;

public class Bush extends APlant {

    //FIELDS
    private String fruit;
    private LeafType leafType;

    //CONSTRUCTORS
    public Bush(String name) {
        super(name);
    }

    public Bush(String name, Double height) {
        super(name, height);
    }
    public Bush(String name, Double height,String fruit,LeafType leafType) {
        super(name, height);
        this.fruit=fruit;
        this.leafType=leafType;
    }

    //METHODS

    //METHOD_OVERRIDE_FROM_APLANT
    public int compareTo(APlant otherPlant) {
        return super.compareTo(otherPlant);
    }

    public String getFruit() {
        return this.fruit;
    }

    public LeafType getLeafType() {
        return this.leafType;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Bush is " + this.fruit + " and leafType is:" + this.leafType ;
    }
}
