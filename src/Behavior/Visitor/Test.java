package Behavior.Visitor;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:35
 * @PackageName:Behavior.Visitor
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//将某种数据结构中的各元素分离出来封装成独立的类
public class Test {
    public static void main(String[] args) {
        XiaoAi xiaoAi=new XiaoAi();
        xiaoAi.answerQuestion();
        UpdatePackage updatePackage=new UpdatePackage("联网增强功能");
        xiaoAi.acceptUpdate(updatePackage);
        xiaoAi.answerQuestion();
    }
}
