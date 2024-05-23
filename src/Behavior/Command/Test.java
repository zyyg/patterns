package Behavior.Command;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:55
 * @PackageName:Behavior.Command
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//将请求封装为一个对象，使发出请求的责任和执行请求的责任分隔开
public class Test {
    public static void main(String[] args) {
        TeacherTongInvoker teacherTongInvoker = new TeacherTongInvoker();
        teacherTongInvoker.setCommand(new WuHanTravelCommand());
        teacherTongInvoker.call();
    }
}
