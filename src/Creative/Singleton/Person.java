package Creative.Singleton;

/**
 * @Author yyzhou
 * @Date 2024/5/11 14:19
 * @PackageName:Singleton
 * @ClassName: Persion
 * @Description: TODO
 * @Version 1.0
 */
public class Person {
    private String name;
    private String age;

    private  static Person instance;
    //构造器私有，外部不能实例化
    private Person(){
        System.out.println("创建了Person");
    }
    //提供给外部的方法
    //1、synchronized 锁太大
    public static Person Boss(){
        //如果没有再去创建
        if(instance==null){
            //2、第二种锁 shu
            synchronized (Person.class){
                if (instance==null){
                    Person person = new Person();
                    instance = person;
                }
            }
        }
        return instance;
    }
}
