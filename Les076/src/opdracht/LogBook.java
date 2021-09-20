package opdracht;

public class LogBook {

    private Animal[] animals;

    public LogBook(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    // TODO: add here a polymorphic method which will print nickname of all animals

    public void printNickNamesOfAllAnimals(){
        for(int index = 0; index < animals.length; index++){
            System.out.println(animals[index].getNickname());
        }
    }
    
}
