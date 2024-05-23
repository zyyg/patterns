package Creative.Factory.AbstractFactory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 19:35
 * @PackageName:Factory.AbstractFactory
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */

public class test {
    public static void main(String[] args) {
        WulinFactory wulinFactory=new WulinWuHanMaskFactory();
        AbstractCar abstractCar=wulinFactory.newCar();

        WulinFactory wulinFactory1=new WulinRacingCarFactory();
        AbstractCar abstractCar1 = wulinFactory1.newCar();

        WulinFactory wulinFactory2=new WulinVanCarFactory();
        AbstractCar abstractCar2 = wulinFactory2.newCar();
//        abstractCar.run();
        abstractCar1.run();
        abstractCar2.run();
    }
}
