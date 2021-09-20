package polyformismm;

public class NoiseMaker {

    public void noise(Dog dog){
        dog.makeSound();
    }

    // METHOD_OVERLOADING
    public void noise(Pig pig){
        pig.makeSound();
    }

    // METHOD_OVERLOADING
    public void noise(Cat cat){
        cat.makeSound();
    }

    // METHOD_OVERLOADING
    public void noise(Elephant elephant){
        // Elephant does NOT have any method override
        elephant.makeSound();
    }

    // METHOD_OVERLOADING
    public void noise(Mouse mouse){
        // Mouse does NOT have any method override
        mouse.makeSound();
    }

    // METHOD_OVERLOADING
    public void noise(Wolf wolf){
        // Wolf does NOT have any method override
        wolf.makeSound();
    }

    // METHOD_OVERLOADING
    public void noise(Human human){
        // Wolf does NOT have any method override
        human.makeSound();
    }

}
