package polyformismm;

public class ForestAppV2 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Pig pig1 = new Pig();
        Pig pig2 = new Pig();

        Elephant elephant1 = new Elephant();

        Mouse mouse1 = new Mouse();

        Wolf wolf1 = new Wolf();

        Human human1 = new Human();

        NoiseMaker noiseMaker = new NoiseMaker();

        noiseMaker.noise(dog1);
        noiseMaker.noise(dog2);
        noiseMaker.noise(pig1);
        noiseMaker.noise(pig2);
        noiseMaker.noise(elephant1);
        noiseMaker.noise(mouse1);
        noiseMaker.noise(wolf1);
        noiseMaker.noise(human1);

        SmartNoiseMaker smartNoiseMaker = new SmartNoiseMaker();

        String SEPARATOR = "---------------------------------------";
        System.out.println(SEPARATOR);

        // Polymorphism is about the data structure.
        smartNoiseMaker.noise(dog1);
        smartNoiseMaker.noise(dog2);
        smartNoiseMaker.noise(pig1);
        smartNoiseMaker.noise(pig2);
        smartNoiseMaker.noise(elephant1);
        smartNoiseMaker.noise(mouse1);
        smartNoiseMaker.noise(wolf1);
        smartNoiseMaker.noise(human1);


    }
}
