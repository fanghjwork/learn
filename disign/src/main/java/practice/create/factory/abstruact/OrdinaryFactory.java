package practice.create.factory.abstruact;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryFactory
 * @Description TODO
 * @date 2020/3/30  17:05
 **/
public class OrdinaryFactory implements ProductFactory {
    @Override
    public Television getTelevision() {
        return new OrdinaryTelevision();
    }

    @Override
    public Refrigerator getRefrigerator() {
        return new OrdinaryRefrigerator();
    }
}
