package Behavior.Interpreter;

/**
 * @Author yyzhou
 * @Date 2024/5/18 20:22
 * @PackageName:Behavior.Interpreter
 * @ClassName: OrExpression
 * @Description: TODO
 * @Version 1.0
 */
public class OrExpression extends IDCardExpression{

    private IDCardExpression city;
    private IDCardExpression type;

    public OrExpression(IDCardExpression city, IDCardExpression type){
        this.city=city;
        this.type=type;
    }
    @Override
    boolean interpret(String expression) {

        return city.interpret(expression)|| type.interpret(expression);
    }
}
