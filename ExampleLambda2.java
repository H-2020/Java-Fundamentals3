package lambda;

public class ExampleLambda2 {

    @FunctionalInterface
    public interface LambdaSum {
        int sum(int x, int y);
    }

    public static void main(String[] args) {
        LambdaSum sum = (int x, int y) -> { return x + y; };

        System.out.println(sum.sum(10, 5));
    }
}
