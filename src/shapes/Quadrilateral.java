package shapes;

import org.w3c.dom.ls.LSOutput;

public class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

public static void main(String[] args) {
    Rectangle rec = new Rectangle(10, 20);
//    rec.getArea();
    System.out.println(rec.getArea());
    System.out.println(rec.getPerimeter());

    Square sqr = new Square(10);
    System.out.println(sqr.getPerimeter());
    System.out.println(sqr.getArea());

    Quadrilateral quad = new Quadrilateral(20,25);
    System.out.println(quad.getArea());
    System.out.println(quad.getPerimeter());
}

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }
}
