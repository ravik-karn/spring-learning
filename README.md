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
    * Create class with constructor ```<constructor-arg value="Equilateral"/>``` 
    or setter ```<property name="type" value="RIGHT ANGLE"></property>``` 
    * Create XML bean tag ```<bean id="triangle" class="spring.Triangle"> </bean>```
    * Create object of BeanFactory ```BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));```
    or Create object of ApplicationContext ```ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");``` 
    * Call ```getBean``` with bean ID to create bean.
    * Type and order of bean parameters are automatically inferred
    * Type can be explicitly defined also using ```<constructor-arg type="int" value="10"/>```
    * Order of bean parameters an be explicitly defined also using ```<constructor-arg index="0" value="Equilateral"/>```
    
```diff    
- While using ApplicationContext bean XML file should be in the class path
```
