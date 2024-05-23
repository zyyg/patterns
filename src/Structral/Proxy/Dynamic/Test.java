package Structral.Proxy.Dynamic;

/**
 * @Author yyzhou
 * @Date 2024/5/12 13:06
 * @PackageName:Structral.Proxy.Dynamic
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//动态代理模式
public class Test {
    public static void main(String[] args) {
        ManTikTok liSiTikTok = new LiSiTikTok();
        ManTikTok proxy = JDKTiktokProxy.getProxy(liSiTikTok);

        proxy.tiktok();

    }
}
