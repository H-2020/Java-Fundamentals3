package calculator;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setX(2);
        rectangle.setY(2);
        rectangle.setHeight(-20);
        rectangle.setWidth(10);
        rectangle.grow(-5);
        rectangle.print();
        System.out.println(rectangle.getArea());
    }
}
