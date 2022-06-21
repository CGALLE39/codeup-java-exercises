package shapes;

abstract class Shape {

    protected double length;
    protected double width;



    public double getWidth() { return width;}

    public double getLength() {return length;}

    public void  setLength(double length) { this.length = length; }

    public void setWidth(double width) {this.width = width;}

    abstract double getPerimeter();
    abstract double getArea();

}
