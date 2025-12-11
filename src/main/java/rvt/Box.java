package rvt;

public class Box {
    private  double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }
    public Box(Box oldBox) {

    }
    public double volume() {
        return width * height * length;
    }
    public double  area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }
    private double faceArea() {
        return length * height;
    }
    private double topArea() {
        return length * width;
    }
    private double sideArea() {
        return width * height;
    }

    public double length() {
        return length;
    }
    public double height() {
        return height;
    }
    public double width() {
        return width;
    }

    public Box biggerBox( Box oldBox ) {
        return new Box( 1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }
    public Box smallerBox( Box oldBox ) {
        return new Box( 0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }
    public boolean nests( Box outsideBox ) {
        if (height < outsideBox.height) {
            return true;
        } else
        if (width < outsideBox.width) {
            return true;
        } else {
            return length < outsideBox.length;
        }
    }
}