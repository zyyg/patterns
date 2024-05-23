package Creative.Factory.AbstractFactory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:29
 * @PackageName:Factory.AbstractFactory
 * @ClassName: WulinVanCarFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WulinVanCarFactory extends WulinFactory{
    @Override
    AbstractMask newMask() {
        return null;
    }

    @Override
    AbstractCar newCar() {
        return new VanCar();
    }
}
