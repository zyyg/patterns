package Behavior.Interpreter;

import javax.xml.bind.Element;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:20
 * @PackageName:Behavior.Interpreter
 * @ClassName: Area
 * @Description: TODO
 * @Version 1.0
 */
public class Area {

    Set<String> city=new HashSet<>();//免费城市
    Set<String> type=new HashSet<>();//免费人群s

    IDCardExpression idCardExpression;

    public Area(){
        city.add("武汉市");
        city.add("上海市");
        type.add("医生");
        type.add("老人");
        type.add("儿童");
        TerminalExpression city=new TerminalExpression(this.city,":");
        TerminalExpression type=new TerminalExpression(this.city,"-");

        idCardExpression = new OrExpression(city,type);
    }

    void getTicket(String expression){
        boolean interpret = idCardExpression.interpret(expression);
        if(interpret){
            System.out.println("免票通过");
        }else {
            System.out.println("对不起，请购票 ");
        }

    }
}
