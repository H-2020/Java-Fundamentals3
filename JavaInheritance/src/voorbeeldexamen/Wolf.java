package voorbeeldexamen;

public class Wolf extends Animal{

    private String name;
    private int lifespan;

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void makeNoise() {
        System.out.println("Auuuuuuwwww");

    }

    public void makeNoise(String noise) {

    }

    //METHOD_OVERRIDE_FROM_ANIMAL
    public boolean isAlive() {
        return false;
    }
}
