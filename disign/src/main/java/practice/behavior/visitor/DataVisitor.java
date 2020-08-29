package practice.behavior.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DataVisitor
 * @Description TODO
 * @date 2020/4/1  10:45
 **/
public class DataVisitor implements Visitor{

    @Override
    public void visit(NormalEmployee normalEmployee) {
        System.out.println("大数据部门计算"+normalEmployee.getName()+"正式员工的工资");
    }

    @Override
    public void visit(TemporaryEmployee temporaryEmployee) {
        System.out.println("大数据部门计算"+temporaryEmployee.getName()+"临时员工的工资");
    }
}
