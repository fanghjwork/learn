package practice.create.factory.abstruact;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductFactory
 * @Description TODO
 * @date 2020/3/30  17:00
 **/
public interface ProductFactory {

    //生产，产品族

    Television getTelevision();

    Refrigerator getRefrigerator();
}
