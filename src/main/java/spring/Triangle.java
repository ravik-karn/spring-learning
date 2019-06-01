package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Triangle implements BeanClassLoaderAware, BeanFactoryAware, BeanNameAware, DisposableBean {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
        System.out.println("called: constructor");
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        System.out.println("called: constructor");
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void setPointA(Point pointA) {
        System.out.println("called: setPointA");
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        System.out.println("called: setPointB");
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        System.out.println("called: setPointC");
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle: " + this.pointA + this.pointB + this.pointC;
    }

    public void draw() {
        System.out.println("called: bean in use");
        System.out.println("Draw triangle " + this);
    }

    public void setBeanName(String s) {
        System.out.println("called: setBeanName");
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("called: setBeanClassLoader");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("called: setBeanFactory");
    }

    @PostConstruct
    public void initIt() throws Exception {
        System.out.println("called: PostConstruct initIt");
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        System.out.println("called: PostConstruct cleanUp");
    }

    private void triangleInit() {
        System.out.println("called: custom init for triangle bean");
    }

    public void destroy() throws Exception {
        System.out.println("called: destroy from disposable bean");
    }

    private void triangleDestroy() {
        System.out.println("called: custom destroy for triangle bean");
    }

    @Override
    protected void finalize(){
        System.out.println("called: finalize");
    }
}
