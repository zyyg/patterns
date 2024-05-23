package Structral.FacadePattern;

/**
 * @Author yyzhou
 * @Date 2024/5/18 9:55
 * @PackageName:Structral.FacadePattern
 * @ClassName: WeiXinFacade
 * @Description: TODO
 * @Version 1.0
 */
public class WeiXinFacade {

    Police police=new Police();
    Edu edu=new Edu();
    Social social=new Social();
    public void handleXxx(String name){
        police.register(name);
        edu.assignSchool(name);
        social.handleSocial(name);

    }
}
