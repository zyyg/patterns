package Behavior.state;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:15
 * @PackageName:Behavior.state
 * @ClassName: TeamState
 * @Description: TODO
 * @Version 1.0
 */
public interface TeamState {

    void playGame();
    //切换下一个状态
    TeamState next();

}
