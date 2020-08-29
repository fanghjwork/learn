package practice.behavior.observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  20:15
 **/
public class Client {

    public static void main(String[] args) {
        //观察者模式
        //角色，目标类，具体目标类，抽象观察者，具体观察者
        Target target = new Clan("战队1");
        Observer observer1 = new Employee("李四");
        Observer observer2 = new Employee("王五");
        Observer observer3 = new Employee("赵六");

        target.setList(observer1);
        target.setList(observer2);
        target.setList(observer3);

        observer1.help(target);
    }
}
