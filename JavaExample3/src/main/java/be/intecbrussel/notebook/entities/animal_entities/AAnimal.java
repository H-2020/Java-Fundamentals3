package be.intecbrussel.notebook.entities.animal_entities;

public abstract class AAnimal implements Comparable<AAnimal>{

    //FIELDS
    private static int animalCount;
    private final Integer id;
    private final String name;
    private Double weight;
    private Double height;
    private Double length;

    //CONSTRUCTORS

    public AAnimal(String name) {
        this.name = name;
        this.id=animalCount;
        animalCount++;
    }

    public AAnimal(String name, Double weight, Double height, Double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.id=animalCount;
        animalCount++;
    }

    //METHODS
    //METHOD_OVERRIDE_FROM_COMPARABLE
    public int compareTo(AAnimal otheranimal) {
        return 0;
    }
    public void decrementAnimalCount(){

    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AAnimal)) return false;

        AAnimal aAnimal = (AAnimal) o;


        return this.name.equals(aAnimal.getName());
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getWeight() {
        return this.weight;
    }


    public Double getHeight() {
        return this.height;
    }

    public Double getLength() {
        return length;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        return result;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    public void setLength(Double length) {
        this.length = length;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Animal's id is:"+ this.id +" name:'" + this.name ;
    }

    //METHODE_ANIMAL_COUNTER
    public static int getAnimalCount() {
        return animalCount;
    }
}
