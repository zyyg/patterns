package Creative.Factory.FactoryMethod;

/**
 * @Author yyzhou
 * @Date 2024/5/11 18:00
 * @PackageName:Factory.FactoryMethod
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractCarFactory carFactory=new WuliRecingCarFactory();
        AbstractCar abstractCar = carFactory.newCar();
        abstractCar.run();

        AbstractCarFactory abstractCarFactory=new WuliMiniCarFactory();
        AbstractCar abstractCar1 = abstractCarFactory.newCar();
        abstractCar1.run();

        AbstractCarFactory abstractCarFactory1=new WuliVanCarFactory();
        AbstractCar abstractCar2 = abstractCarFactory1.newCar();
        abstractCar2.run();
    }
}
