package Creative.Prototype;

/**
 * @Author yyzhou
 * @Date 2024/5/11 14:41
 * @PackageName:Prototype
 * @ClassName: main
 * @Description: TODO
 * @Version 1.0
 */
public class main {
    public static void main(String[] args) {
        GuiguMybatis mybatis = new GuiguMybatis();
        //从缓存中拿十分危险
        User user = mybatis.getUser("zhangsan");
        User user1 = mybatis.getUser("张三");
        User user2 = mybatis.getUser("张三");
        User user3 = mybatis.getUser("张三");
        User user4 = mybatis.getUser("张三");
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
