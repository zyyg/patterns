package Creative.Factory.simpleFrctory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 15:08
 * @PackageName:Factory.simpleFrctory
 * @ClassName: WuliFactory
 * @Description: TODO
 * @Version 1.0
 */
//简单工厂产品数量有限
public class WuliFactory {

    public AbstractCar newCar(String type){
        if ("van".equals(type)) {
            return new VanCar();
        }else if ("mini".equals(type)){
            return new MinCar();
        }
        return null;
        //更多产品就违反了开闭原则
        //更多产品应该扩展出来一个类
    }
}
