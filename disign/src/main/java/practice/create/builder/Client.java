package practice.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  17:34
 **/
public class Client {

    public static void main(String[] args) {
        //建造者模式
        //抽象建造者，具体建造者，指挥者，产品类

        Builder<Product> builder = new OutfitBuilder();
        Hander hander = new Hander(builder);
        System.out.println(hander.getOutFit());
    }
}
