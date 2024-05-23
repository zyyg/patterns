package Behavior.Visitor;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:43
 * @PackageName:Behavior.Visitor
 * @ClassName: Vistor
 * @Description: TODO
 * @Version 1.0
 */
public interface Visitor {
    void visitCPU(Cpu cpu);
    void VisitDisk(Disk disk);
}
