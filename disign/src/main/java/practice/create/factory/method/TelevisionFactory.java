package practice.create.factory.method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TelevisionFactory
 * @Description TODO
 * @date 2020/3/30  16:23
 **/
public class TelevisionFactory implements ProductFacotry {
    @Override
    public Product getProduct() {
        return new Television();
    }
}
