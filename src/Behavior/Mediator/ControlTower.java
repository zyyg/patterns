package Behavior.Mediator;

/**
 * @Author yyzhou
 * @Date 2024/5/18 15:47
 * @PackageName:Behavior.Mediator
 * @ClassName: ControllTower
 * @Description: TODO
 * @Version 1.0
 */
public class ControlTower {

    private boolean canDo= true;
    public  void acceptRequest(Caption caption, String action){
        if ("fly".equals(action)||"land".equals(action)){
            if (canDo==true){
                System.out.println("允许");
                canDo=false;
            }else {
                System.out.println("不允许");
            }
        }
        if("success".equals(action)){
            canDo=true;
        }
    }
}
