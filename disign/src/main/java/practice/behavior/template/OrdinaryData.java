package practice.behavior.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryData
 * @Description TODO
 * @date 2020/4/1  10:18
 **/
public class OrdinaryData extends Display{
    @Override
    protected void getdata() {
        System.out.println("get ordinaryData");
    }

    @Override
    protected void show() {
        System.out.println("饼状图显示");
    }
}
