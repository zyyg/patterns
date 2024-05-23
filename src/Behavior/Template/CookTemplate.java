package Behavior.Template;

/**
 * @Author yyzhou
 * @Date 2024/5/18 10:49
 * @PackageName:Behavior.Template
 * @ClassName: CookTemplate
 * @Description: TODO
 * @Version 1.0
 */
public abstract class CookTemplate {
    public void cook(){
        heating();
        addfood();
        addsalt();
        stirfry();
        end();
    }

    public void stirfry() {
        System.out.println("翻炒");
    }

    public void addsalt() {
        System.out.println("加入食盐");
    }

    public void addfood() {
        System.out.println("加入事物");
    }

    public void heating(){
        System.out.println("加热");
    }
    public void end(){
        System.out.println("出锅");
    }
}
