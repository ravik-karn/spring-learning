package spring;

public class Triangle {
    private String type;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
    }

    public Triangle(String type) {
        System.out.println("Using constructor");
        this.type = type;
    }

    public Triangle(String type, Point pointA, Point pointB, Point pointC) {
        this.type = type;
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("Using setter");
        this.type = type;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return this.type + " Triangle: " + this.pointA + this.pointB + this.pointC;
    }

    public void draw() {
        System.out.println("Draw triangle " + this);
    }
}
