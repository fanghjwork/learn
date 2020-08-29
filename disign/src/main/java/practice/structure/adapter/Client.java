package practice.structure.adapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  19:47
 **/
public class Client {

    public static void main(String[] args) {
        //适配器模式
        //角色：抽象目标类，适配器，适配者
        Target target = new Adapter(new Calculation());
        System.out.println(target.request("3","3"));
    }
}
