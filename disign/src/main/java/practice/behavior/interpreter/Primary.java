package practice.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Primary
 * @Description TODO
 * @date 2020/3/31  15:56
 **/
public class Primary implements Interpreter{

    private String command;

    private String text;

    @Override
    public void LoadInterpreter(Context context) {
            this.command = context.current();
            if("print".equals(this.command)){
                this.text = context.next();
            }
    }

    @Override
    public void execute() {
        if("print".equals(this.command)){
            System.out.print(this.text);
        }else if("space".equals(this.command)){
            System.out.print(" ");
        }else if("break".equals(this.command)){
            System.out.println();
        }
    }
}
