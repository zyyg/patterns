package Behavior.strategy;

/**
 * @Author yyzhou
 * @Date 2024/5/18 11:05
 * @PackageName:Behavior.strategy
 * @ClassName: SteadyStrategy
 * @Description: TODO
 * @Version 1.0
 */
public class SteadyStrategy implements GameStrategy{
    @Override
    public void warStrategy() {
        System.out.println("各路小心，及时支援");
    }
}
