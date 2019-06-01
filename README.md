# Spring Framework learning

## Importing
mvn install

mvn package

## Table of content
* Spring architecture
* Spring Bean
* Spring Core
* Spring AOP

## Spring Architecture
[Architecture](./resource/spring-overview.png)

## Spring Bean
* Spring Bean is a POJO.
* It is created by spring container
* Bean Factory uses Factory design pattern
* Two ways to create Bean
    * Using XML Bean Factory
        * Lazily initialized 
    * Using Application context
        * Initialized during app instantiation
        * Very useful when we need singleton objects
* Dependency injection
    * Based on inversion of control principle(SOLID)
    * Dependency flow should be in opposite direction of control flow
* Steps for creating Bean
    * Create class with constructor or getter and setter
    * Create XML bean tag ```<bean id="triangle" class="spring.Triangle"> </bean>```
    * Create object of BeanFactory ```BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));```
    or Create object of ApplicationContext ```ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");``` 
    * Call ```getBean``` with bean ID to create bean.

```diff    
- While using ApplicationContext bean XML file should be in the class path
```
    
     
