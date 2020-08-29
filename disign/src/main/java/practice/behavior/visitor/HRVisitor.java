package practice.behavior.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName HRVisitor
 * @Description TODO
 * @date 2020/4/1  10:47
 **/
public class HRVisitor implements Visitor{
    @Override
    public void visit(NormalEmployee normalEmployee) {
        System.out.println("人事部门计算"+normalEmployee.getName()+"正式员工的工资");
    }

    @Override
    public void visit(TemporaryEmployee temporaryEmployee) {
        System.out.println("人事部门计算"+temporaryEmployee.getName()+"临时员工的工资");
    }
}
