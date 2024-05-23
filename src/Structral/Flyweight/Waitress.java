package Structral.Flyweight;

/**
 * @Author yyzhou
 * @Date 2024/5/18 10:20
 * @PackageName:Structral.Flyweight
 * @ClassName: Waitress
 * @Description: TODO
 * @Version 1.0
 */
public class Waitress extends AbstractWaitressFlyweight{
    String id;
    String name;
    int age;
    //以上是不变的
    boolean canService= true;//能否服务

    @Override
    void service() {
        System.out.println("工号"+id+"名字"+name+"age"+"正在为你服务");
        this.canService=false;
    }

    @Override
    void end() {
        System.out.println("工号"+id+"名字"+name+"age"+"正在为你服务");
        this.canService=false;
    }
}
