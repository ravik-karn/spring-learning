package spring;

public class Triangle {
    private String type;
    private int height;

    public Triangle() {}

    public Triangle(String type) {
        System.out.println("Using constructor");
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("Using setter");
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return this.type + " Triangle Height: " + this.height;
    }

    public void draw() {
        System.out.println("Draw triangle " + this);
    }
}
