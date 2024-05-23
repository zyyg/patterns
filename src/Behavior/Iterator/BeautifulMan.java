package Behavior.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:12
 * @PackageName:Behavior.Iterator
 * @ClassName: BeautifulMan
 * @Description: TODO
 * @Version 1.0
 */
public abstract class BeautifulMan {
    private List<String> girlFriends=new ArrayList<>();

    void likeYou(String name){
        girlFriends.add(name);
    }
    void sayBye(String name){
        girlFriends.remove(name);
    }

    public Itr getIterator(){
        return null;
    }

    class Iterator implements Itr{
        private int cursor=0;
        @Override
        public boolean hashNext() {
            return false;
        }

        @Override
        public String next() {
            return null;
        }
    }

    interface Itr{
        boolean hashNext();
        String next();
    }
}
