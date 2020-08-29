package practice.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ChairMan
 * @Description TODO
 * @date 2020/3/31  15:17
 **/
public class ChairManHander extends Hander {
    @Override
    public void operation(Employee employee) {
        //领导批假
         System.out.println("chairman 审批通过");

    }
}
