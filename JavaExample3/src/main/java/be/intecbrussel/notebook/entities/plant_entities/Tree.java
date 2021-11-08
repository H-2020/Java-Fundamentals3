package be.intecbrussel.notebook.entities.plant_entities;

public class Tree extends APlant{

    //FIELDS
    private LeafType leafType;


    //CONSTRUCTORS
    public Tree(String name) {
        super(name);
    }

    public Tree(String name, Double height) {

        super(name, height);
    }

    public Tree(String name, Double height, LeafType leafType) {
        super(name, height);
        this.leafType = leafType;
    }

    //METHODS

    public LeafType getLeafType() {
        return this.leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "LeafType of trees: " + this.leafType ;
    }
}
