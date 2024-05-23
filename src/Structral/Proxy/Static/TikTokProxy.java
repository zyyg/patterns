package Structral.Proxy.Static;

/**
 * @Author yyzhou
 * @Date 2024/5/12 12:56
 * @PackageName:Structral.Proxy.Static
 * @ClassName: TikTokProxy
 * @Description: TODO
 * @Version 1.0
 */
public class TikTokProxy implements ManTikTok{

    private ManTikTok manTikTok;
    public TikTokProxy(ManTikTok manTikTok){
        this.manTikTok=manTikTok;
    }

    @Override
    public void tiktok() {
        System.out.println("武汉分三正在直播");
        manTikTok.tiktok();
    }
}
