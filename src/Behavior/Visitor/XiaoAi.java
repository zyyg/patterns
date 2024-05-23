package Behavior.Visitor;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:43
 * @PackageName:Behavior.Visitor
 * @ClassName: XiaoAi
 * @Description: TODO
 * @Version 1.0
 */
public class XiaoAi {

    private Cpu cpu=new Cpu("武汉天气");
    private Disk disk=new Disk("武汉天气");

    void answerQuestion(){
        cpu.work();
        disk.work();
    }

    void acceptUpdate(Visitor visitor){
        visitor.visitCPU(cpu);
        visitor.VisitDisk(disk);

    }
}
