package practice.create.factory.method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RefrigeratorFactory
 * @Description TODO
 * @date 2020/3/30  16:24
 **/
public class RefrigeratorFactory implements ProductFacotry {
    @Override
    public Product getProduct() {
        return new Refrigerator();
    }
}
