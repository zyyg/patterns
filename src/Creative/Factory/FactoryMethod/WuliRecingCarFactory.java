package Creative.Factory.FactoryMethod;

/**
 * @Author yyzhou
 * @Date 2024/5/11 17:59
 * @PackageName:Factory.FactoryMethod
 * @ClassName: WuliRecingCarFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WuliRecingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
