package Creative.Factory.AbstractFactory;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:21
 * @PackageName:Factory.AbstractFactory
 * @ClassName: N95Mask
 * @Description: TODO
 * @Version 1.0
 */
public class N95Mask extends AbstractMask{
    public N95Mask(){
        this.price=2;
    }

    @Override
    public void protectedMe() {
        System.out.println("普通口罩....");
    }
}
