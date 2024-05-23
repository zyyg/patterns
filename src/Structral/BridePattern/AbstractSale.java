package Structral.BridePattern;

/**
 * @Author yyzhou
 * @Date 2024/5/12 10:15
 * @PackageName:Structral.BridePattern
 * @ClassName: AbstractSale
 * @Description: TODO
 * @Version 1.0
 */
public abstract class AbstractSale {

    private String type;
    private Integer price;
    public AbstractSale(String type,Integer price){
        this.type=type;
        this.price=price;
    }
    String  getSaleInfo(){
        return "渠道："+type+"==>价格："+price;
    }

}
