package be.intecbrussel.notebook.entities.animal_entities;


import be.intecbrussel.notebook.entities.plant_entities.APlant;
import be.intecbrussel.notebook.entities.plant_entities.Flower;

import java.util.ArrayList;
import java.util.Collections;

public class Herbivore extends AAnimal{

    //FIELDS
    private ArrayList<APlant> plantDiet=new ArrayList<>();


    //CONSTRUCTORS
    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, Double weight, Double height, Double length) {
        super(name, weight, height, length);
    }

    //METHODS
    public void addPlantDiet(APlant plantDiet){
        this.plantDiet.add(plantDiet);

    }

    //METHOD_OVERRIDE_FROM_AANIMAL
    public int compareTo(AAnimal otheranimal) {

        return super.compareTo(otheranimal);
    }

    public ArrayList<APlant> getPlantDiet() {

        return this.plantDiet;
    }
    public void printDiet(){

    }

    public void setPlantDiet(ArrayList<APlant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return super.getName()+"  has diet for the " + this.plantDiet ;
    }
}
