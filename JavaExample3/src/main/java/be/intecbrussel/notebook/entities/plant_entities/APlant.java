package be.intecbrussel.notebook.entities.plant_entities;

public abstract class APlant implements Comparable<APlant>{

    //FIELDS
    private static int plantCount;
    private final Integer id;
    private final String name;
    private Double height;

    //CONSTRUCTORS
    public APlant(String name) {
        this.name = name;
        this.id=plantCount;
        plantCount++;
    }

    public APlant(String name, Double height) {
        this.name = name;
        this.height = height;
        this.id=plantCount;
        plantCount++;
    }

    //METHODS
    //METHOD_OVERRIDE_FROM_COMPARABLE
    public int compareTo(APlant otherPlant) {

        return 0;
    }
    public void decrementPlantCount(){

    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof APlant)) return false;

        APlant aPlant = (APlant) o;

        return this.name.equals(aPlant.getName());
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getHeight() {
        return this.height;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }
    public void incrementPlantCount(){

    }

    public void setHeight(Double height) {

        this.height = height;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Plant's id is: " + this.id +" name:" + this.name ;
    }

    //METHODE_PLANT_COUNTER
    public static int getPlantCount() {
        return plantCount;
    }
}
