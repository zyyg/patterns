package Structral.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yyzhou
 * @Date 2024/5/18 10:00
 * @PackageName:Structral.Composite
 * @ClassName: Menu
 * @Description: TODO
 * @Version 1.0
 */
public class Menu {
    private Integer id;
    private String name;
    public Menu(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    //组合模式关注点
    private List<Menu> childs = new ArrayList<>();
    void addChildMenu(Menu menu){
        childs.add(menu);
    }

    void printMenu(){
        System.out.println(name);
        if(childs.size()>0) {
            for (Menu menu1 : childs) {
                menu1.printMenu();
            }
        }
    }

}
