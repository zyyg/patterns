package Behavior.Mediator;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:34
 * @PackageName:Behavior.Mediator
 * @ClassName: Hu8778
 * @Description: TODO
 * @Version 1.0
 */
public class Hu8778 extends Caption{
    ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    void fly() {
        System.out.println("hu8778请求起飞");
        controlTower.acceptRequest(this, "fly");
    }

    @Override
    void land() {
        System.out.println("Hu8778请求降落");
        controlTower.acceptRequest(this,"land");
    }

    @Override
    void success() {
        System.out.println("完成");
        controlTower.acceptRequest(this,"success");
    }
}
