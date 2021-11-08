package be.intecbrussel.notebook.entities.app;

import be.intecbrussel.notebook.entities.animal_entities.AAnimal;
import be.intecbrussel.notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.notebook.entities.plant_entities.*;
import be.intecbrussel.notebook.entities.service.ForestNotebook;

public class NatureApp {

    public static void main(String[] args) {

        //INSTANTIATION
        ForestNotebook forestNotebook1 = new ForestNotebook();

        //ENUM_SCENT
        Scent smell1 = Scent.SWEET;
        Scent smell2 = Scent.EARTHY;
        Scent smell3 = Scent.PINEAPPLE;
        Scent smell4 = Scent.SOUR;
        Scent smell5 = Scent.ORANGE;
        Scent smell6 = Scent.SOUR;
        Scent smell7 = Scent.MUSKY;

        //ENUM_LEAFTYPE
        LeafType leafType1=LeafType.HAND;
        LeafType leafType2=LeafType.HEART;
        LeafType leafType3=LeafType.ROUND;
        LeafType leafType4=LeafType.SPEAR;
        LeafType leafType5=LeafType.NEEDLE;

        //INSTANTIATION_FOR_PLANTS
        Tree tree = new Tree("Apricot", 50.0, leafType1);
        Flower flower= new Flower("Rose",10.0, smell2);
        Weed weed1 = new Weed("Weed", 20.0, 20.0);
        Bush bush=new Bush("Bush",10.0,"strawberry",leafType3);
        Weed weed2 = new Weed("Weed2", 10.0, 50.0);

        //INSTANTIATION_FOR_ANIMALS
        Carnivore carnivore1 = new Carnivore("Carni", 5.0);
        Carnivore carnivore2 = new Carnivore("Vore", 7.0);
        Carnivore carnivore3 = new Carnivore("Leon", 12.0);
        Herbivore herbivore1 = new Herbivore("Her", 30.0, 20.0, 15.0);
        Herbivore herbivore2 = new Herbivore("Bivo", 30.0, 20.0, 15.0);
        Herbivore herbivore3 = new Herbivore("Bivore", 50.0, 50.0, 25.0);
        Omnivore omnivore1 = new Omnivore("Omn", 10.0);
        Omnivore omnivore2 = new Omnivore("Nivore", 8.0);
        Omnivore omnivore3 = new Omnivore("Omne", 4.0);


        //ADD_PLANTS_IN_ADDPLANTDIET_METHOD
        herbivore1.addPlantDiet(flower);
        herbivore2.addPlantDiet(bush);
        herbivore3.addPlantDiet(tree);
        omnivore1.addPlantDiet(bush);
        omnivore2.addPlantDiet(weed1);

        //ADD_PLANTS_IN_FORESTNOTEBOOK
        forestNotebook1.addPlant(flower);
        forestNotebook1.addPlant(tree);
        forestNotebook1.addPlant(weed1);
        forestNotebook1.addPlant(bush);
        forestNotebook1.addPlant(weed2);

        //ADD_ANIMALS_IN_FORESTNOTEBOOK
        forestNotebook1.addAnimal(carnivore1);
        forestNotebook1.addAnimal(carnivore2);
        forestNotebook1.addAnimal(carnivore3);
        forestNotebook1.addAnimal(herbivore1);
        forestNotebook1.addAnimal(herbivore2);
        forestNotebook1.addAnimal(herbivore3);
        forestNotebook1.addAnimal(omnivore1);
        forestNotebook1.addAnimal(omnivore2);
        forestNotebook1.addAnimal(omnivore3);

        //WRITE_PLANTS
        System.out.println("Plants: "+forestNotebook1.getaPlants());

        System.out.println("------------------------------");

        //WRITE_ANIMALS
        System.out.println("Carnivores: "+forestNotebook1.getCarnivores());
        System.out.println("Herbivores: "+forestNotebook1.getHerbivores());
        System.out.println("Omnivores: "+forestNotebook1.getOmnivores());

        System.out.println("----------ANIMALS and PLANTS----------");
        //PRINT_ANIMALS_AND_PLANTS_BY_METHODE
        forestNotebook1.printNoteBook();

        System.out.println("---------Carnivores and Omnivores and Herbivores---------");
        //PRINT_Carnivores_Omnivores_Herbivores
        forestNotebook1.printAnimals();

        //SORT_PLANTS
        forestNotebook1.sortPlantsByName();

        //SORT_ANIMALS
        forestNotebook1.sortAnimalsByName();


        System.out.println("---------SORTED ANIMALS and PLANTS---------");
        //PRINT_SORTED_ANIMALS_AND_PLANTS
        forestNotebook1.printAnimals();
        forestNotebook1.printPlants();

    }
}
