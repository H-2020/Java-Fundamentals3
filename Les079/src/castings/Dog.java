package castings;

public class Dog extends Animal {


    public Dog(String nickname) {
        super(nickname);
    }

    public Dog(String nickname, Integer age) {
        super(nickname, age);
    }

    // METHOD_OVERRIDE_FROM_ANIMAL
    public void print() {
        System.out.println("The nickname of this dog is " + super.getNickname());
    }

    public void bowHow(){
        System.out.println("bowhow bowhow!!");
    }

    public boolean equals(Object obj) {
        Dog otherDog = (Dog) obj;
        boolean areDogsNickNamesSame = (super.getNickname().equals(otherDog.getNickname()));
        boolean areDogAgesSame = (super.getAge().equals(otherDog.getAge()));
        return (areDogsNickNamesSame && areDogAgesSame);
    }

    // METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Dog nickname: " + super.getNickname() + ", age:  " + super.getAge();
    }
}
