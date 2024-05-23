package Behavior.ChainResponsibility;

/**
 * @Author yyzhou
 * @Date 2024/5/18 22:11
 * @PackageName:Behavior.ChainResponsibility
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("李四");
        Teacher teacher1=new Teacher("李四1");
        Teacher teacher2=new Teacher("李四2");

        teacher.setNext(teacher1);
        teacher1.setNext(teacher2);
        teacher.handleRequest();

    }
}
