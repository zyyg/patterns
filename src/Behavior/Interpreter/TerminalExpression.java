package Behavior.Interpreter;

import java.util.Set;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:22
 * @PackageName:Behavior.Interpreter
 * @ClassName: terminalExpression
 * @Description: TODO
 * @Version 1.0
 */
public class TerminalExpression  extends IDCardExpression{

    Set<String> data;
    String symbol;
    public TerminalExpression(Set<String> data,String symbol){
        this.data=data;
        this.symbol=symbol;
    }

    @Override
    boolean interpret(String expression) {
        String[] split = expression.split(symbol);

        boolean result=false;
        for (String s : split) {
            if (data.contains(s)){
                return true;
            }
        }
        return false;
    }
}
