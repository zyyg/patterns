package Behavior.Visitor;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:43
 * @PackageName:Behavior.Visitor
 * @ClassName: Cpu
 * @Description: TODO
 * @Version 1.0
 */
public class Cpu extends Hardware{

    public Cpu(String command){
        super(command);
    }

    @Override
    public void work() {
        System.out.println("CPU正在处理指令"+command);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCPU(this);
    }
}
