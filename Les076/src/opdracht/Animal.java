package opdracht;

// extends Object is redundant
public abstract class Animal extends Object{

    // ID is auto-generated
    private static int animalCounter;

    private int id;
    private String nickname;
    private int age;

    public Animal() {
        animalCounter++;
        this.id = animalCounter;
    }

    /* auto-generated methods */

    public int getId() {
        return this.id;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* custom methods */

    public void makeSound(){
        System.out.println("Animal sound....");
    }

}
