package Behavior.Visitor;

/**
 * @Author yyzhou
 * @Date 2024/5/18 21:44
 * @PackageName:Behavior.Visitor
 * @ClassName: UpdatePackage
 * @Description: TODO
 * @Version 1.0
 */
public class UpdatePackage implements Visitor{

    private String ext;
    public UpdatePackage(String ext){
        this.ext=ext;
    }
    @Override
    public void visitCPU(Cpu cpu) {
        cpu.command+="》》》正在互联网查询"+ext;
    }

    @Override
    public void VisitDisk(Disk disk) {
        disk.command+=">>>联网查询中"+ext;
    }
}
