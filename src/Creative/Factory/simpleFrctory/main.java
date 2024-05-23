package Creative.Factory.simpleFrctory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 15:05
 * @PackageName:Factory.simpleFrctory
 * @ClassName: man
 * @Description: TODO
 * @Version 1.0
 */
public class main {
    public static void main(String[] args) {
        WuliFactory factory = new WuliFactory();
        AbstractCar van=factory.newCar("van");
        AbstractCar mini=factory.newCar("mini");
        System.out.println(van);
        System.out.println(mini);
        van.run();
        mini.run();
    }
}
