package Behavior.Command;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:58
 * @PackageName:Behavior.Command
 * @ClassName: WuHanTravelCommand
 * @Description: TODO
 * @Version 1.0
 */
public class WuHanTravelCommand implements Command {

    private  LeiReceiver receiver=new LeiReceiver();
    @Override
    public void execute() {
        System.out.println("我要去旅游啦。。。。。");
        receiver.travel();
    }
}
