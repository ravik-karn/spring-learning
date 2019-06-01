package spring;

import java.util.List;

public class Triangle {
    private String type;
    private List<Point> points;

    public Triangle() {
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, List<Point> points) {
        this.type = type;
        this.points = points;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return this.type + " Triangle: " + this.points.get(0) + this.points.get(1) + this.points.get(2);
    }

    public void draw() {
        System.out.println("Draw triangle " + this);
    }
}
