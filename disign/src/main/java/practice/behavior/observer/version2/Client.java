package practice.behavior.observer.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  20:24
 **/
public class Client {

    public static void main(String[] args) {
        //jdk观察者模式
        //目标类，具体目标类，观察者，观察者
        Chan chan = new Chan("战队1");
        Player ls = new Player("李四");
        Player w = new Player("王五");
        Player zl = new Player("赵六");

        chan.addObserver(ls);
        chan.addObserver(w);
        chan.addObserver(zl);

        ls.help(chan);
    }
}
