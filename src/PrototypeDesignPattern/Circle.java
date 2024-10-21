package PrototypeDesignPattern;

public class Circle implements Shape{

    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }
}
