package shapes;
 class Square extends Rectangle {

    public double getArea() {
    return side * side;
}


    public double getPerimeter() {
    return side * 4;
}

public Square (double side) {
        super(side, side);            //new rectangle(len, wid)
        this.side = side;

}

    private double side;
}
