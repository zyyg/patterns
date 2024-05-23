package Behavior.Mediator;

/**
 * @Author yyzhou
 * @Date 2024/5/18 15:56
 * @PackageName:Behavior.Mediator
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Hu8778 hu8778=new Hu8778();
        SC8633 sc8633=new SC8633();

        ControlTower controlTower=new ControlTower();
        hu8778.setControlTower(controlTower);
        sc8633.setControlTower(controlTower);

        hu8778.fly();
        hu8778.success();
        sc8633.fly();
    }
}
