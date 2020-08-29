package practice.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SumCommand
 * @Description TODO
 * @date 2020/3/31  15:46
 **/
public class SumCommand implements Command {

    private Sum sum = new Sum();

    @Override
    public int sumCommand(int a, int b) {
        return sum.calculation(a,b);
    }
}
