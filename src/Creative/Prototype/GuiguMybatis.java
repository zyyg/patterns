package Creative.Prototype;

/**
 * @Author yyzhou
 * @Date 2024/5/11 14:32
 * @PackageName:Prototype
 * @ClassName: prototype
 * @Description: TODO
 * @Version 1.0
 */
//原型模型可能引起脏缓存问题
public class GuiguMybatis {
    public User getUser(String username){
        User user=getUserFromDb(username);
        return user;
    }

    private User getUserFromDb(String username) {
        System.out.println("从数据库查用户");
        User user=new User();
        user.setUsername(username);
        user.setAge(18);
        return user;
    }
}
