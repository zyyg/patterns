package Structral.Decorator;

/**
 * @Author yyzhou
 * @Date 2024/5/12 10:38
 * @PackageName:Structral.Decorator
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//装饰器不用连接2个类，是增强一个类
public class Test {
    public static void main(String[] args) {
        ManTikTok manTikTok=new ZhangSanTikTok();
//        manTikTok.tiktok();

        MeiYanDecorator decorator=new MeiYanDecorator(manTikTok);
        decorator.tiktok();
    }
}
