package Behavior.Visitor;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:44
 * @PackageName:Behavior.Visitor
 * @ClassName: Disj
 * @Description: TODO
 * @Version 1.0
 */
public class Disk extends Hardware{
    public Disk(String command){
        super(command);
    }

    @Override
    public void work() {
        System.out.println("Hard:"+command);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.VisitDisk(this);
    }
}
