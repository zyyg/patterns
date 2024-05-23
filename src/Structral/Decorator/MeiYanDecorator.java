package Structral.Decorator;

/**
 * @Author yyzhou
 * @Date 2024/5/12 10:47
 * @PackageName:Structral.Decorator
 * @ClassName: MeiYanDecorator
 * @Description: TODO
 * @Version 1.0
 */
public class MeiYanDecorator implements TikTokDecorator{

    private  ManTikTok manTikTok;
    public MeiYanDecorator(ManTikTok manTikTok){
        this.manTikTok=manTikTok;
    }
    @Override
    public void enable() {
        System.out.println("开启美颜效果");
    }

    @Override
    public void tiktok() {
        //开启美颜
        enable();
        manTikTok.tiktok();
    }
}
