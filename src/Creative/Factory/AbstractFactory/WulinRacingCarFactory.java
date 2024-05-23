package Creative.Factory.AbstractFactory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:28
 * @PackageName:Factory.AbstractFactory
 * @ClassName: WulinRacingCarFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WulinRacingCarFactory extends WulinFactory{
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }

    @Override
    AbstractMask newMask() {
        return null;
    }
}
