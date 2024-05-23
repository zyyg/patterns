package Creative.Builder;

/**
 * @Author yyzhou
 * @Date 2024/5/11 22:46
 * @PackageName:Builder
 * @ClassName: Phone
 * @Description: TODO
 * @Version 1.0
 */
public class Phone {
    protected String cpu;
    protected String mem;
    protected String disk;
    protected String cam;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mem='" + mem + '\'' +
                ", disk='" + disk + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMem() {
        return mem;
    }

    public String getDisk() {
        return disk;
    }

    public String getCam() {
        return cam;
    }
}
