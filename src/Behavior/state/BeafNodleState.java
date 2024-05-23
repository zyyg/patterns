package Behavior.state;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:17
 * @PackageName:Behavior.state
 * @ClassName: BeafNodleState
 * @Description: TODO
 * @Version 1.0
 */
public class BeafNodleState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("吃牛肉面。。。。。。。。。");
    }

    @Override
    public TeamState next() {
//        System.out.println("");
        return new MatchState();
    }
}
