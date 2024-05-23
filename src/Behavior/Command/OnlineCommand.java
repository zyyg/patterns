package Behavior.Command;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:58
 * @PackageName:Behavior.Command
 * @ClassName: OnlineCommand
 * @Description: TODO
 * @Version 1.0
 */
public class OnlineCommand implements Command{

    private LeiReceiver receiver=new LeiReceiver();
    @Override
    public void execute() {
        System.out.println("我要去上课啦。。。。。");
        receiver.online();
    }
}
