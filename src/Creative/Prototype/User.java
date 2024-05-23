package Creative.Prototype;

/**
 * @Author yyzhou
 * @Date 2024/5/11 14:34
 * @PackageName:Prototype
 * @ClassName: User
 * @Description: TODO
 * @Version 1.0
 */
public class User {
    private String username;
    private Integer age;

    public User(){
        System.out.println("user对象创建");
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }
}
