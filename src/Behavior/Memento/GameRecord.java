package Behavior.Memento;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:00
 * @PackageName:Behavior.Memento
 * @ClassName: GameRecord
 * @Description: TODO
 * @Version 1.0
 */
public class GameRecord {
    Integer id;
    Integer coin;
    Integer hp;
    Integer mp;

    void getCurrent(){
        System.out.println("coin"+coin+"\t"+"hp:"+hp+"\t"+"mp:"+mp+"\t");
    }
}
