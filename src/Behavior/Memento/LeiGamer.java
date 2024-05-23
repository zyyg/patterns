package Behavior.Memento;

/**
 * @Author yyzhou
 * @Date 2024/5/18 19:11
 * @PackageName:Behavior.Memento
 * @ClassName: LeiGamer
 * @Description: TODO
 * @Version 1.0
 */
public class LeiGamer {

    Integer coin;
    Integer hp;
    Integer mp;
    Integer level;

    GameServer gameServer=new GameServer();
    //以上是内部状态，需要保存的信息
    void saveGameRecord(){
        System.out.println("正在保存当前记录");
    }

    void getFromMemento(){
        System.out.println("读取历史记录");
    }
    void playGame(){
        System.out.println("开始玩游戏");
    }
    void exitGame(){
        System.out.println("退出游戏");
    }

}
