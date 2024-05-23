package Structral.BridePattern;

/**
 * @Author yyzhou
 * @Date 2024/5/12 10:12
 * @PackageName:Structral.BridePattern
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//将抽象和实现解耦，使得两者独立变化
public class Test {
    public static void main(String[] args) {
        IPhone iPhone=new IPhone();
        iPhone.setSale(new StudentSale("线下",19999));
//        iPhone.setSale(new OnlineSale("线上",19999));


        String phone= iPhone.getPhone();
        System.out.println(phone);
    }
}
