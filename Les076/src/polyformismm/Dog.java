package polyformismm;

public class Dog extends Animal{

    private boolean aggressive;

    // METHOD_OVERRIDE_FROM_ANIMAL
    public void makeSound() {
        System.out.println("The dog says bow wow ...");
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }
}
