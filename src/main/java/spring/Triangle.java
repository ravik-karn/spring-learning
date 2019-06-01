package spring;

public class Triangle {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Triangle() {}

    @Override
    public String toString() {
        return this.type + " Triangle";
    }

    public void draw() {
        System.out.println("Draw triangle " + this.type);
    }
}
