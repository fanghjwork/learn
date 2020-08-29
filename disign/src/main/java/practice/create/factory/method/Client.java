package practice.create.factory.method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  16:20
 **/
public class Client {

    public static void main(String[] args) {
        //工厂方法模式
        //抽象工厂类，具体工厂类，抽象产品，具体产品
        ProductFacotry productFacotry = new TelevisionFactory();
        productFacotry.getProduct().display();
    }
}
