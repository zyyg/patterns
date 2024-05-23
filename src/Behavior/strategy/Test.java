package Behavior.strategy;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:00
 * @PackageName:Behavior.strategy
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        TeamGNR teamGNR = new TeamGNR();
        teamGNR.setGameStrategy(new SteadyStrategy());
        teamGNR.starGame();
    }
}
