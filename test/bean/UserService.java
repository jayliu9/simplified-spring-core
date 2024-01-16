package bean;

public class UserService {
    private String name;

    public UserService() {
        this.name = "default";
    }

    public UserService(String name) {
        this.name = name;
    }

    public String queryUserInfo() {
        return "Username: " + name;
    }

    public String sayHello() {
        return "Hello!";
    }
}
