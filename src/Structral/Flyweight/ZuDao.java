package Structral.Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author yyzhou
 * @Date 2024/5/18 10:24
 * @PackageName:Structral.Flyweight
 * @ClassName: ZuDao
 * @Description: TODO
 * @Version 1.0
 */
public class ZuDao {
    private Map<String ,AbstractWaitressFlyweight> pool=new HashMap<>();

    public void addWaitress(AbstractWaitressFlyweight waitressFlyweight){
        pool.put(UUID.randomUUID().toString(),waitressFlyweight);
    }

    public static AbstractWaitressFlyweight getWaitress(String name){
        System.out.println();
        return null;
    }
}
