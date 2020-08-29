package practice.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  11:05
 **/
public class Client {

    public static void main(String[] args) {
        //装饰器模式
        //抽象构件类，具体构件类，抽象装饰器，具体装饰器

        Component component = new Text();
        Decorator decorator = new DecoratorFrame(component);
        decorator.show();
    }
}
