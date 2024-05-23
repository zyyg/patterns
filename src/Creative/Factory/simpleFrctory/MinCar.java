package Creative.Factory.simpleFrctory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 15:10
 * @PackageName:Factory.simpleFrctory
 * @ClassName: MinCar
 * @Description: TODO
 * @Version 1.0
 */
public class MinCar extends AbstractCar{
    public MinCar(){
        this.engine="单杠柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine+"哒哒哒");
    }
}
