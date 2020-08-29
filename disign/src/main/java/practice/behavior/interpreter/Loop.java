package practice.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Loop
 * @Description TODO
 * @date 2020/3/31  15:57
 **/
public class Loop implements Interpreter{

    private Interpreter interpreter;

    private int number;

    @Override
    public void LoadInterpreter(Context context) {
        this.number = Integer.valueOf( context.next());
        this.interpreter = new Hander();
        this.interpreter.LoadInterpreter(context);
    }

    @Override
    public void execute() {
        for (int i = 0 ;i< this.number;i++ ) {
            interpreter.execute();
        }
    }
}
