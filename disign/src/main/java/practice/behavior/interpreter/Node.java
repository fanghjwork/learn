package practice.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Node
 * @Description TODO
 * @date 2020/3/31  15:57
 **/
public class Node implements Interpreter {

    private Interpreter interpreter;

    @Override
    public void LoadInterpreter(Context context) {
        if("loop".equals(context.current())){
            this.interpreter = new Loop();
            this.interpreter.LoadInterpreter(context);
        }else{
            this.interpreter = new Primary();
            this.interpreter.LoadInterpreter(context);
        }
    }

    @Override
    public void execute() {
        this.interpreter.execute();
    }
}
