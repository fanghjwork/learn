package practice.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  15:32
 **/
public class Client {

    public static void main(String[] args) {
        //命令模式
        //角色,请求者，抽象命令类，具体命令类，接收者
        Command command = new SumCommand();
        Request request = new Request();
        request.setCommand(command);
        request.request(3,3);
    }
}
