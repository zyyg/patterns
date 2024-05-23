package Structral.adpter;

/**
 * @Author yyzhou
 * @Date 2024/5/12 9:32
 * @PackageName:Structral.adpter
 * @ClassName: Moveies
 * @Description: TODO
 * @Version 1.0
 */
public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("正在播放：甄嬛传.avi");
        String content="你好";
        System.out.println(content);
        return content;
    }
}
