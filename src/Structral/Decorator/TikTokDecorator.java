package Structral.Decorator;

/**
 * @Author yyzhou
 * @Date 2024/5/12 10:46
 * @PackageName:Structral.Decorator
 * @ClassName: TikTokDecorator
 * @Description: TODO
 * @Version 1.0
 */
//抽象层装饰器
public interface TikTokDecorator extends ManTikTok{
    void enable();
    @Override
    void tiktok();
}
