package spring;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle: " + this.pointA + this.pointB + this.pointC;
    }

    public void draw() {
        System.out.println("Draw triangle " + this);
    }
}
