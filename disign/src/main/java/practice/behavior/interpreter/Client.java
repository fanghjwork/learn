package practice.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  15:51
 **/
public class Client {

    public static void main(String[] args) {
        //解释器模式
        //抽象表达式，终结表达式，非终结表达式，环境类
        //LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉

        Interpreter hander = new Hander();
        String str ="loop 2 print 杨过 space space print 小龙女 break end print 郭靖 space space print 黄蓉 break";
        hander.LoadInterpreter(new Context(str));
        hander.execute();
    }
}
