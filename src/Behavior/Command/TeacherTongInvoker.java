package Behavior.Command;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:58
 * @PackageName:Behavior.Command
 * @ClassName: TeacherTongInvoker
 * @Description: TODO
 * @Version 1.0
 */
public class TeacherTongInvoker {
    Command command;

    public void call(){
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
