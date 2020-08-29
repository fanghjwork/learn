package practice.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Interpreter
 * @Description TODO
 * @date 2020/3/31  16:01
 **/
public interface Interpreter {

    void LoadInterpreter(Context context);

    void execute();
}
