package Creative.Factory.FactoryMethod;

/**
 * @Author yyzhou
 * @Date 2024/5/11 17:58
 * @PackageName:Factory.FactoryMethod
 * @ClassName: WuliVanCarFactory
 * @Description: TODO
 * @Version 1.0
 */
public class WuliVanCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
