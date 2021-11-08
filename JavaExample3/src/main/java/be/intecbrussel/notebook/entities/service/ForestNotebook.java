package be.intecbrussel.notebook.entities.service;

import be.intecbrussel.notebook.entities.animal_entities.AAnimal;
import be.intecbrussel.notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.notebook.entities.plant_entities.APlant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForestNotebook {

    //FIELDS
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private List<APlant> aPlants = new ArrayList<>();
    private List<AAnimal> animals = new ArrayList<>();



    //CONSTRUCTORS
    public ForestNotebook() {
    }


    //ADD_METHODS
    public void addAnimal(Carnivore carnivore) {
        if(!this.carnivores.contains(carnivore)){
            this.carnivores.add(carnivore);
        }else{
            System.out.println("Carnivore already exists.");
        }
    }

    public void addAnimal(Herbivore herbivore) {
        if(!this.herbivores.contains(herbivore)){
        this.herbivores.add(herbivore);
        }else{
            System.out.println("Herbivore already exists.");
        }

    }

    public void addAnimal(Omnivore omnivore) {
        if(!this.omnivores.contains(omnivore)){
        this.omnivores.add(omnivore);
        }else{
            System.out.println("Omnivore already exists.");
        }
    }

    public void addPlant(APlant aPlant) {
        if(!this.aPlants.contains(aPlant)){
        this.aPlants.add(aPlant);
        }else{
            System.out.println("Plant already exists.");
        }
    }
    //METHODS
    private boolean animalExists(AAnimal aAnimal) {
        return true;
    }

    public List<Carnivore> getCarnivores() {
        return this.carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return this.omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return this.herbivores;
    }

    public List<APlant> getaPlants() {
        return aPlants;
    }

    private boolean plantExists(APlant aPlant) {
        return true;
    }
    //PRINT_METHODS
    public void printAnimals() {

        for (int index = 0; index < carnivores.size(); index++) {
            System.out.println("Carnivores: "+carnivores.get(index));

        }
        for (int index = 0; index < omnivores.size(); index++) {
            System.out.println("Omnivores: "+omnivores.get(index));

        }
        for (int index = 0; index < herbivores.size(); index++) {
            System.out.println("Herbivores: "+herbivores.get(index));

        }

    }

    public void printNoteBook() {

        for (int index = 0; index < carnivores.size(); index++) {
            System.out.println(carnivores.get(index));

        }
        for (int index = 0; index < omnivores.size(); index++) {
            System.out.println(omnivores.get(index));

        }
        for (int index = 0; index < herbivores.size(); index++) {
            System.out.println(herbivores.get(index));

        }
        for (int index = 0; index < aPlants.size(); index++) {
            System.out.println(aPlants.get(index));

        }

        for (int index = 0; index < animals.size(); index++) {
            System.out.println(animals.get(index));

        }

    }

    public void printPlants() {
        for (int index = 0; index < aPlants.size(); index++) {
            System.out.println(aPlants.get(index));

        }
    }
    //RANDOMIZE_ANIMAL
    public void randomizeAnimalOrder() {
        Collections.shuffle(animals);
    }
    //RANDOMIZE_PLANTS
    public void randomizePlantOrder() {
        Collections.shuffle(aPlants);
    }

    public void setCarnivores(List<Carnivore> carnivores) {

        this.carnivores = carnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }
    //SORT_METHODS
    public void sortAnimalsByName() {
        Collections.sort(animals);

    }

    public void sortPlantsByName() {
        Collections.sort(aPlants);

    }

}

