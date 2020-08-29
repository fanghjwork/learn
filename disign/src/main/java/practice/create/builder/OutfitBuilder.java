package practice.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OutfitBuilder
 * @Description TODO
 * @date 2020/3/30  18:31
 **/
public class OutfitBuilder extends Builder<Product> {



    @Override
    public void createHead() {
        getProduct().setHead("黑色帽子");
    }

    @Override
    public void createBody() {
        getProduct().setBody("裙子");
    }

    @Override
    public void createBottom() {
        getProduct().setBottom("牛仔裤");
    }

    @Override
    public Product getResult() {
        return getProduct();
    }
}
