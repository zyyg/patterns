package Creative.Builder;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:49
 * @PackageName:Builder
 * @ClassName: AbstractBuilder
 * @Description: TODO
 * @Version 1.0
 */
public abstract class AbstractBuilder {
    Phone phone;
    abstract void customCpu(String cpu);
    abstract void customMem(String mem);
    abstract void customDisk(String disk);
    abstract void customCam(String cam);

    Phone getProduct(){
        return phone;
    }
}
