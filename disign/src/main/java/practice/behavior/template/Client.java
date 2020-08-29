package practice.behavior.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/4/1  10:12
 **/
public class Client {

    public static void main(String[] args) {
        //模板方法模式
        //角色，抽象类，具体子类
        Display ordinary = new OrdinaryData();
        ordinary.templateMethod();

        System.out.println("================");
        Display xml = new XMLData();
        xml.templateMethod();
    }
}
