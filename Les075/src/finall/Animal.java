package finall;

public abstract class Animal {

    // if animal isAlive true, we cannot change the state to false

    // RULE: IF YOU WANT TO MAKE SURE THAT THERE SHOULD NOT BE A DEFAULT VALUE
    // USE 'final' KEYWORD FOR THE RELATED FIELD

    // if you make a fiend final, you have to give a value to make your code compiled
    // if you make a field FINAL, you can never change the value after the first initialization.
    private final boolean alive;

    private String nickname;
    private int age;
    private boolean domestic;

    public Animal(int age) {
        this.age = age;
        this.alive = true;
    }

    public Animal(int age, boolean alive) {
        this.age = age;
        this.alive = alive;
    }

    public Animal(String nickname, int age, boolean domestic) {
        this.nickname = nickname;
        this.age = age;
        this.domestic = domestic;
        this.alive = true;
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

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public boolean isAlive() {
        return alive;
    }

    public abstract void makeNoise();
}
