package Creative.Builder;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:50
 * @PackageName:Builder
 * @ClassName: XiaomiBuilder
 * @Description: TODO
 * @Version 1.0
 */
public class XiaomiBuilder extends AbstractBuilder{
    public XiaomiBuilder(){
        phone=new Phone();
    }
    @Override
    void customCpu(String cpu) {
        phone.cpu=cpu;
    }

    @Override
    void customCam(String cam) {
        phone.cam=cam;
    }

    @Override
    void customMem(String mem) {
        phone.mem=mem;
    }

    @Override
    void customDisk(String disk) {
        phone.disk=disk;
    }

}
