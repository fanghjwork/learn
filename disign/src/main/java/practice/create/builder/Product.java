package practice.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Product
 * @Description TODO
 * @date 2020/3/30  18:27
 **/
public class Product {

    private String head;

    private String body;

    private String bottom;

    @Override
    public String toString() {
        return "Product{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", bottom='" + bottom + '\'' +
                '}';
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }
}
