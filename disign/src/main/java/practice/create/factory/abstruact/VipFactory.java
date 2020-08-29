package practice.create.factory.abstruact;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipFactory
 * @Description TODO
 * @date 2020/3/30  17:01
 **/
public class VipFactory implements ProductFactory {
    @Override
    public Television getTelevision() {
        return new VIpTelevision();
    }

    @Override
    public Refrigerator getRefrigerator() {
        return new VipRefrigerator();
    }
}
