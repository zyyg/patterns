package Structral.adpter.Obj;

import Structral.adpter.Player;
import Structral.adpter.Translator;
import Structral.adpter.Zh_EnTranslator;

/**
 * @Author yyzhou
 * @Date 2024/5/12 9:36
 * @PackageName:Structral.adpter.clazz
 * @ClassName: EnMoviePlayer
 * @Description: TODO
 * @Version 1.0
 */
public class EnMoviePlayerAdapter implements Player {

    private Translator translator=new Zh_EnTranslator();
    private Player target;
    public EnMoviePlayerAdapter(Player target){
        this.target=target;
    }


    @Override
    public String play() {
        String play=target.play();
        //转换字幕
        String translate = translator.translate(play);
        System.out.println("英文："+translate);
        return null;
    }

}
