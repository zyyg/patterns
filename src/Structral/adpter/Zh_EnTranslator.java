package Structral.adpter;

/**
 * @Author yyzhou
 * @Date 2024/5/12 9:33
 * @PackageName:Structral.adpter
 * @ClassName: Zh_EnTranslator
 * @Description: TODO
 * @Version 1.0
 */
public class Zh_EnTranslator implements Translator{
    @Override
    public String translate(String content) {
        if("你好".equals(content)){
            return "HEllO";
        }
        if("什么".equals(content)){
            return "what";
        }
        return "******";
    }
}
