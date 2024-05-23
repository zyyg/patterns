package Creative.Builder;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:39
 * @PackageName:Builder
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */
//建造者创建的细节复杂，还必须暴露给使用者
public class test {
    public static void main(String[] args) {

        AbstractBuilder builder=new XiaomiBuilder();

        builder.customMem("16G");
        builder.customCpu("1T");
        builder.customDisk("2亿");
        builder.customCam("晓龙8个8");

        Phone product=builder.getProduct();
        System.out.println(product);
    }
}
