package calculator;

public class Rectangle {

    private int x;
    private int y;
    private int height;
    private int width;
    private int d;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }


    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }


    public int getX() {

        return this.x;
    }

    public void setX(int x) {
        if (x < 0) {
            this.x = Math.abs(x);
        } else {
            this.x = x;
        }
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        if (y < 0) {
            this.y = Math.abs(y);
        } else {
            this.y = y;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            this.height = Math.abs(height);
        } else {

            this.height = height;
        }
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            this.width = Math.abs(width);
        } else {

            this.width = width;
        }
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return (this.height * this.width);
    }

    public double getPerimeter() {
        return (2 * (this.height + this.width));
    }

    public void grow(int d) {
        if (d < 0) {
            this.d=Math.abs(d);
            this.height = this.height +this.d;
            this.width = this.width +this.d;
        } else {
            this.height = this.height + d;
            this.width = this.width + d;
        }

    }

    public void print(){
        System.out.println("The height is: "+ this.height);

        System.out.println("The width is: "+ this.width);
        System.out.println("Area "+ getArea());


    }
}
