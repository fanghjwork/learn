package practice.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Builder
 * @Description TODO
 * @date 2020/3/30  18:30
 **/
public abstract class Builder<T> {

    private Product product = new Product();

    protected Product getProduct() {
        return product;
    }

    public abstract void createHead();

    public abstract void createBody();

    public abstract void createBottom();

    public abstract T getResult();
}
