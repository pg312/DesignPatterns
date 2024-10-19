package SingletonDesignPattern;

public class User {

    private String name;
    private int age;
    private static User user;
    private User(){
        name = "random";
        age = 10;
    }
    public static User getUserObject(){
        if(user == null)
            user = new User();
        return user;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
