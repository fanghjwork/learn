package practice.structure.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  20:01
 **/
public class Client {

    public static void main(String[] args) {
        //桥接模式
        //角色：抽象类，扩充抽象类，实现类接口，具体实现类
        Pen pen = new HairPen(new BlackColor());
        pen.showPen();

    }
}
