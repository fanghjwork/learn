package practice.behavior.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/4/1  10:29
 **/
public class Client {

    public static void main(String[] args) {
        //访问者模式
        //角色：抽象访问者，具体访问者，抽象元素类，具体元素类，结构对象
         Employee ls = new NormalEmployee("李四",30);
         Employee w = new NormalEmployee("王五",28);
         Employee zl = new TemporaryEmployee("赵六",200);
        Employee zs = new TemporaryEmployee("战神",180);

        Hander hander = new Hander();
        hander.setEmployee(ls);
        hander.setEmployee(w);
        hander.setEmployee(zl);
        hander.setEmployee(zs);

        Visitor visitor = new DataVisitor();
        hander.execute(visitor);
    }
}
