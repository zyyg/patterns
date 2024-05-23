package Creative.Factory.AbstractFactory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:27
 * @PackageName:Factory.AbstractFactory
 * @ClassName: WulinFactory
 * @Description: TODO
 * @Version 1.0
 */
//总厂规范
public abstract class WulinFactory {
    abstract AbstractCar newCar();
    abstract AbstractMask newMask();
}
