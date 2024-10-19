package SingletonDesignPattern;
/*Problem statement: Single instance of User class has to be created*/
public class SingletonDesignPattern {

    public void singletonPatternExample(){
        System.out.println(User.getUserObject().getName() + "\t"+User.getUserObject().getAge());
        System.out.println(User.getUserObject().getName() + "\t"+User.getUserObject().getAge());
    }
}
