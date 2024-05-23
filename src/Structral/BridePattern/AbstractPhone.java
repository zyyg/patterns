package Structral.BridePattern;

/**
 * @Author yyzhou
 * @Date 2024/5/12 10:13
 * @PackageName:Structral.BridePattern
 * @ClassName: AbstractPhone
 * @Description: TODO
 * @Version 1.0
 */
public abstract class AbstractPhone {
    //桥接在此
    AbstractSale sale;
//    abstract int getPrice();如果这么写，违反开闭原则

    abstract String getPhone();

    public void setSale(AbstractSale sale) {
        this.sale = sale;
    }
}
