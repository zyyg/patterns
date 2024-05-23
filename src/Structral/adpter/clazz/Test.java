package Structral.adpter.clazz;

import Structral.adpter.MoviePlayer;

/**
 * @Author yyzhou
 * @Date 2024/5/12 9:47
 * @PackageName:Structral.adpter.clazz
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
//继承的方式实现适配器
public class Test {
    public static void main(String[] args) {
        MoviePlayer moviePlayer = new MoviePlayer();
        EnMoviePlayerAdapter enMoviePlayerAdapter = new EnMoviePlayerAdapter(moviePlayer);
        enMoviePlayerAdapter.play();
    }
}
