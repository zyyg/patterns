package Structral.adpter;

/**
 * @Author yyzhou
 * @Date 2024/5/11 23:34
 * @PackageName:Structral.adpter
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
/*Target:目标
Adaptee:适配者
Adapter:适配器
* */
public class Test {
    public static void main(String[] args) {

        MoviePlayer moviePlayer=new MoviePlayer();
        //不能实现翻译
        moviePlayer.play();

        EnMovieAdapter adapter=new EnMovieAdapter();
        adapter.play();
    }
}
