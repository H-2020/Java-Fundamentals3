package lambda;

public class ExampleLambda {

    @FunctionalInterface
    public interface LambdaInterface {

        // An abstract function
        void abstractFunction(int x);
    }

    public static void main(String[] args) {
        // lambda expression to implement above
// functional interface. This interface
// by default implements abstractFunction()
        LambdaInterface expression = (int x) -> System.out.println(2 * x);

// This calls above lambda expression and prints 2 times our input.
        expression.abstractFunction(5);
    }
}