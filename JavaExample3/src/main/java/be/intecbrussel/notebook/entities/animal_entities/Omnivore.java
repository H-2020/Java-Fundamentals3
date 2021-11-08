package be.intecbrussel.notebook.entities.animal_entities;

import be.intecbrussel.notebook.entities.plant_entities.APlant;

import java.util.ArrayList;

public class Omnivore extends AAnimal  {

    //FIELDS
    private ArrayList<APlant> plantDiet = new ArrayList<>();
    private Double maxFoodSize;

    //CONSTRUCTORS

    public Omnivore(String name,Double maxFoodSize) {
        super(name);
        this.maxFoodSize=maxFoodSize;
    }

    public Omnivore(String name, Double weight, Double height, Double length) {

        super(name, weight, height, length);
    }

    //METHODS
    public void addPlantDiet(APlant plantDiet){
        this.plantDiet.add(plantDiet);

    }

    //METHOD_OVERRIDE_FROM_COMPARABLE
    public int compareTo(Omnivore otherOmnivore) {

        return 0;
    }

    public ArrayList<APlant> getPlantDiet() {

        return this.plantDiet;
    }

    public void setPlantDiet(ArrayList<APlant> plantDiet) {

        this.plantDiet = plantDiet;
    }

    public Double getMaxFoodSize() {

        return this.maxFoodSize;
    }

    public void setMaxFoodSize(Double maxFoodSize) {

        if (this.maxFoodSize > 10) {
            System.out.println("He can not eet more");
        } else {

            this.maxFoodSize = maxFoodSize;
        }
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return super.getName()+" has diet for" + this.plantDiet +
                " and eets max " + this.maxFoodSize +" kg food" ;
    }
}
