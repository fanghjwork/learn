package practice.behavior.memorandum;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  17:32
 **/
public class Client {

    public static void main(String[] args) {
        //备忘录模式
        //角色：原发器，备忘录，负责人

        Manager manager = new Manager();
        Origin origin = new Origin();
        origin.setValue("a");
        System.out.println(origin.getValue());
        manager.setMemorandum(origin.save());
        origin.setValue("b");
        System.out.println(origin.getValue());
        origin.back(manager.getMemorandum());
        System.out.println(origin.getValue());
    }
}
