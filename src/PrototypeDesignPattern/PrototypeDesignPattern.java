package PrototypeDesignPattern;

public class PrototypeDesignPattern {
    public void prototypeDesignPatternExample(){

        Circle circle = new Circle(10);
        System.out.println(circle.radius);

        Circle cloneCircle = (Circle) circle.clone();
        System.out.println(cloneCircle.radius);

    }
}
