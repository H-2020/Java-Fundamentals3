package be.intecbrussel.notebook.entities.animal_entities;

public class Carnivore extends AAnimal {

    //FIELDS
    private Double maxFoodSize;

    //CONSTRUCTORS

    public Carnivore(String name,Double maxFoodSize) {
        super(name);
        this.maxFoodSize=maxFoodSize;
    }

    public Carnivore(String name, Double weight, Double height, Double length) {

        super(name, weight, height, length);
    }

    //METHODS

    //METHOD_OVERRIDE_FROM_AANIMAL
    public int compareTo(AAnimal otheranimal) {

        return super.compareTo(otheranimal);
    }

    public Double getMaxFoodSize() {
        return this.maxFoodSize;
    }

    public void setMaxFoodSize(Double maxFoodSize) {
        if (this.maxFoodSize > 10.0) {
            System.out.println("He can not eet more");
        } else {

            this.maxFoodSize = maxFoodSize;
        }
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {

        return super.getName()+" eets max " + this.maxFoodSize +" kg food";
    }
}
