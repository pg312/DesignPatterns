import AbstractFactoryDesignPattern.AbstractFactoryDesignPattern;
import BuilderDesignPattern.BuilderDesignPattern;
import FactoryDesignPattern.FactoryDesignPattern;
import SingletonDesignPattern.SingletonDesignPattern;

public class Main {

    public static void main(String[] args){
        FactoryDesignPattern factoryDesignPattern = new FactoryDesignPattern();
        factoryDesignPattern.factoryDesignPatternExample();

        AbstractFactoryDesignPattern abstractFactoryDesignPattern = new AbstractFactoryDesignPattern();
        abstractFactoryDesignPattern.abstractFactoryDesignPatternExample();

        SingletonDesignPattern singletonDesignPattern = new SingletonDesignPattern();
        singletonDesignPattern.singletonPatternExample();

        BuilderDesignPattern builderDesignPattern = new BuilderDesignPattern();
        builderDesignPattern.builderDesignPatternExample();
    }
}
