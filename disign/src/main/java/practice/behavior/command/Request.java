package practice.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Request
 * @Description TODO
 * @date 2020/3/31  15:43
 **/
public class Request {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void request(int a,int b){
        int sum = command.sumCommand(a,b);
        System.out.println("sum is "+sum);
    }
}
