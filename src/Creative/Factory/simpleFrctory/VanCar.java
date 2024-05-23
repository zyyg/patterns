package Creative.Factory.simpleFrctory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 15:09
 * @PackageName:Factory.simpleFrctory
 * @ClassName: VanCar
 * @Description: TODO
 * @Version 1.0
 */
public class VanCar extends AbstractCar{
    public VanCar(){
        this.engine="柴油";
    }

    @Override
    public void run() {
        System.out.println(engine+"哒哒哒");
    }
}
