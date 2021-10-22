package voorbeeldexamen;

public abstract class Animal {

    private String animalName;

    public abstract boolean isAlive();

    public boolean valid;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        if ((animalName.length() < 3)&&(!animalName.matches("\\w+"))) {
            valid = false;
        } else {
            valid = true;
            this.animalName = animalName;
        }
    }

    public boolean validate() {
        return valid;
    }
}
