package Behavior.state;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:16
 * @PackageName:Behavior.state
 * @ClassName: VocationState
 * @Description: TODO
 * @Version 1.0
 */
public class VocationState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("三亚旅游很舒服，不玩游戏");
    }

    @Override
    public TeamState next() {
        return new BeafNodleState();
    }
}
