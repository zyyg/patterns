package Behavior.Memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:00
 * @PackageName:Behavior.Memento
 * @ClassName: GameServer
 * @Description: TODO
 * @Version 1.0
 */
public class GameServer {
    //管理备忘录信息
    Map<Integer,GameRecord> records=new HashMap<>();

    void add(GameRecord gameRecord){
        records.put(gameRecord.id,gameRecord);
    }

    LeiGamer getRecord(){
//        GameRecord gameRecord=records.get(id);
        LeiGamer leiGamer=new LeiGamer();
        return  leiGamer;
    }

}
