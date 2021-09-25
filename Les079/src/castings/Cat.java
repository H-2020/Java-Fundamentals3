package castings;

public class Cat extends Animal {

    public Cat(String nickname) {
        super(nickname);
    }

    public Cat(String nickname, Integer age) {
        super(nickname, age);
    }

    public Cat getThis() {
        return this;
    }

    // METHOD_OVERRIDE_FROM_ANIMAL
    public void print() {
        System.out.println("The nickname of this cat is " + super.getNickname());
    }

    public void miauw() {
        System.out.println("Miauwwww!");
    }

    // METHOD_OVERRIDE_FROM_OBJECT
    public boolean equals(Object obj) {
        // convert obj instance to Cat instance

        // RULE: type casting is done with the following
        //       ClassName instance = (ClassName) obj;

        // are all cats animals ? YES -> casting from subclass to super
        // are all animals cats ? NO -> casting from super to subclass

        Cat otherCat = (Cat) obj;
        boolean areTheyEqual = (super.getNickname().equals(otherCat.getNickname()));
        return areTheyEqual;
    }

    // METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Cat nickname: " + super.getNickname() + ", age:  " + super.getAge();
    }
}
