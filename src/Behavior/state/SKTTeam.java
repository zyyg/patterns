package Behavior.state;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:14
 * @PackageName:Behavior.state
 * @ClassName: SKTTeam
 * @Description: TODO
 * @Version 1.0
 */
public class SKTTeam {

    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    public void startGame(){
        teamState.playGame();
    }

    void nextState(){
        teamState=teamState.next();
    }
}
