package practice.create.factory.abstruact;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  16:50
 **/
public class Client {

    public static void main(String[] args) {
        //抽象工厂模式
        //角色：抽象工厂，具体工厂，抽象产品，具体产品

        ProductFactory productFactory = new VipFactory();

        productFactory.getRefrigerator().show();
        productFactory.getTelevision().show();
    }
}
