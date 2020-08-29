package practice.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  15:13
 **/
public class Client {

    public static void main(String[] args) {
        //责任链模式
        //角色：抽象处理者，具体处理者
        Hander leader = new LeaderHander();
        Hander manager = new ManageHander();
        Hander chairman = new ChairManHander();

        manager.setHander(chairman);
        leader.setHander(manager);

        leader.operation(new Employee("tim",12));

    }
}
