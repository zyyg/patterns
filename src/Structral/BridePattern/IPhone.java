package Structral.BridePattern;

/**
 * @Author yyzhou
 * @Date 2024/5/12 10:24
 * @PackageName:Structral.BridePattern
 * @ClassName: IPhone
 * @Description: TODO
 * @Version 1.0
 */
public class IPhone extends AbstractPhone{
    @Override
    String getPhone() {
        return "Iphone:"+sale.getSaleInfo();
    }
}
