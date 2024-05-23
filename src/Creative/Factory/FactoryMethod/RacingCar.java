package Creative.Factory.FactoryMethod;

/**
 * @Author yyzhou
 * @Date 2024/5/11 17:53
 * @PackageName:Factory.FactoryMethod
 * @ClassName: SaiCar
 * @Description: TODO
 * @Version 1.0
 */
public class RacingCar extends AbstractCar {
    public RacingCar(){
        this.engine="V8发动机";
    }
    @Override
    public void run() {
        System.out.println(engine+"哒哒哒");
    }
}
