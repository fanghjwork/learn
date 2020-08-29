package practice.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LeaderHander
 * @Description TODO
 * @date 2020/3/31  15:17
 **/
public class LeaderHander extends Hander {

    @Override
    public void operation(Employee employee) {
        //领导批假 1-7 天
        if(employee.getDay() <=7 ){
            System.out.println("leader 审批通过");
            return ;
        }
        super.getHander().operation(employee);
    }
}
