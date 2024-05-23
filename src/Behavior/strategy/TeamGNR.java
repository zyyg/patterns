package Behavior.strategy;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:08
 * @PackageName:Behavior.strategy
 * @ClassName: TeamGNR
 * @Description: TODO
 * @Version 1.0
 */
public class TeamGNR {

    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void starGame(){
        System.out.println("游戏开始");
        gameStrategy.warStrategy();
        System.out.println("win.......");
    }
}
