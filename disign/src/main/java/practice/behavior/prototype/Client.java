package practice.behavior.prototype;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/4/1  10:02
 **/
public class Client {

    public static void main(String[] args) {
        //策略模式
        //角色，环境类，抽象策略类，具体策略类
        Context context = new Context();
        context.setCalculation(new CountCalculation());
        context.execute();
    }
}
