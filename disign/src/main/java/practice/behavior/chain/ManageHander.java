package practice.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ManageHander
 * @Description TODO
 * @date 2020/3/31  15:17
 **/
public class ManageHander extends Hander {
    @Override
    public void operation(Employee employee) {
        //领导批假 8-14 天
        if(employee.getDay() >7 && employee.getDay()<15 ){
            System.out.println("manager 审批通过");
            return ;
        }
        super.getHander().operation(employee);
    }
}
