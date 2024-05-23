package Behavior.Mediator;

/**
 * @Author yyzhou
 * @Date 2024/5/18 15:43
 * @PackageName:Behavior.Mediator
 * @ClassName: SC8633
 * @Description: TODO
 * @Version 1.0
 */
public class SC8633 extends Caption{
    ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    void fly() {
        System.out.println("SC86338请求起飞");
        controlTower.acceptRequest(this, "fly");
    }

    @Override
    void land() {
        System.out.println("SC8633请求着陆");
        controlTower.acceptRequest(this, "land");
    }

    @Override
    void success() {
        System.out.println("SC8633起飞成功");
        controlTower.acceptRequest(this, "success");
    }
}
