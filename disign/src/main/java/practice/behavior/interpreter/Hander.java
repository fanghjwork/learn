package practice.behavior.interpreter;


import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/3/31  15:57
 **/
public class Hander implements Interpreter {

    private List<Interpreter> list = new ArrayList<>();

    @Override
    public void LoadInterpreter(Context context) {

        while(true){
            String value = context.next();
            if("end".equals(value) || StringUtils.isEmpty(value)){
                break;
            }
            Node node = new Node();
            node.LoadInterpreter(context);
            list.add(node);
        }
    }

    @Override
    public void execute() {
        for (Interpreter interpreter : list) {
            interpreter.execute();
        }
    }
}
