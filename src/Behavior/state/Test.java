package Behavior.state;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:13
 * @PackageName:Behavior.state
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//允许状态对象在其内部状态发生改变时改变其行为
public class Test {
    public static void main(String[] args) {
        SKTTeam sktTeam=new SKTTeam();
        TeamState teamState=new VocationState();
        sktTeam.setTeamState(teamState);
        sktTeam.startGame();
        sktTeam.nextState();
        sktTeam.startGame();
        sktTeam.startGame();
        sktTeam.startGame();
    }
}
