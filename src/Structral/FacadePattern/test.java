package Structral.FacadePattern;

/**
 * @Author yyzhou
 * @Date 2024/5/18 9:25
 * @PackageName:Structral.FacadePattern
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */
//外观模式又称为门面模式,是一个通过为多个复杂的子系统提供一个一致的接口
public class test {
    public static void main(String[] args) {
        WeiXinFacade facade=new WeiXinFacade();
        facade.handleXxx("李四");
    }
}
