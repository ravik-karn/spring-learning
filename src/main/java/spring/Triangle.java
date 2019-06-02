package spring;

import org.springframework.context.MessageSource;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle: " + this.pointA + this.pointB + this.pointC;
    }

    public void draw() {
        System.out.println("Draw triangle " + this);
        System.out.println(messageSource.getMessage("drawn", new Object[]{pointA, pointB, pointC}, "drawing", null));
    }
}
