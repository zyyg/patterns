package Behavior.ChainResponsibility;

/**
 * @Author yyzhou
 * @Date 2024/5/18 22:12
 * @PackageName:Behavior.ChainResponsibility
 * @ClassName: Teacher
 * @Description: TODO
 * @Version 1.0
 */
public class Teacher {
    private String name;
    public Teacher(String name){
        this.name=name;
    }
    private Teacher next;
    void handleRequest(){
        System.out.println(this+"正在处理。。。。");
        if(next!=null){
            next.handleRequest();
        }
    }

    public Teacher getNext() {
        return next;
    }

    public void setNext(Teacher next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
