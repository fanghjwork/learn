package practice.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  21:03
 **/
public class Client {

    public static void main(String[] args) {
        //状态模式
        //角色：环境类，抽象状态类，具体状态类
        Account account = new Account("李四");
        Context context = new Context(account);

        context.save(100);
        context.take(1000);
        context.take(200);
        context.take(300);
        context.save(1000);
        context.save(2000);
    }

}
