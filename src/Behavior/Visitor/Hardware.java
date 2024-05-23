package Behavior.Visitor;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:45
 * @PackageName:Behavior.Visitor
 * @ClassName: Hardware
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Hardware {
    String command;
    public Hardware(String command){
        this.command=command;
    }
    public void work(){
        System.out.println(command);
    }

    public abstract void accept(Visitor vistor);
}
