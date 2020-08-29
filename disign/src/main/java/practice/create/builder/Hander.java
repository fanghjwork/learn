package practice.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/3/30  18:34
 **/
public class Hander {

    private Builder<Product> builder;

    public Hander(Builder builder) {
        this.builder = builder;
    }

    public Product getOutFit(){
        this.builder.createHead();
        this.builder.createBody();
        this.builder.createBottom();
        return this.builder.getResult();
    }
}
