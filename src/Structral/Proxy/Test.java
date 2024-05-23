package Structral.Proxy;

import Structral.Proxy.Static.LiSiTikTok;
import Structral.Proxy.Static.TikTokProxy;

/**
 * @Author yyzhou
 * @Date 2024/5/12 12:51
 * @PackageName:Structral.Proxy
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//代理模式
public class Test {
    public static void main(String[] args) {
        TikTokProxy tikTokProxy = new TikTokProxy(new LiSiTikTok());
        tikTokProxy.tiktok();
    }
}
