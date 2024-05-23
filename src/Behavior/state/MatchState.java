package Behavior.state;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:16
 * @PackageName:Behavior.state
 * @ClassName: MatchState
 * @Description: TODO
 * @Version 1.0
 */
public class MatchState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("全力以赴打游戏......");
    }

    @Override
    public TeamState next() {
        return new VocationState();
    }
}
