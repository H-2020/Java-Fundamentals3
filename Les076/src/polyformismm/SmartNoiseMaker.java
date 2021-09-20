package polyformismm;

public class SmartNoiseMaker {

    // Polymorphic coding style = chef's style
    public void noise(Animal animal){
        // don't care which subclass it is
        animal.makeSound();
    }

}
