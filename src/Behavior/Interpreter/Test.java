package Behavior.Interpreter;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:17
 * @PackageName:Behavior.Interpreter
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//给分析对象定义一个语言，并定义该语言的文法表示，在设计一个解释器来解释语句中的句子
public class Test {
    public static void main(String[] args) {
        Area area=new Area();
        String str="上海市:张宏文-医生";
        area.getTicket(str);
    }
}
