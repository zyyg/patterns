package Creative.Factory.AbstractFactory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:30
 * @PackageName:Factory.AbstractFactory
 * @ClassName: WulinWuHanMaskFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WulinWuHanMaskFactory extends WulinFactory{
    @Override
    AbstractCar newCar() {
        return null;
    }

    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }
}
