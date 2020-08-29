package practice.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Component
 * @Description TODO
 * @date 2020/3/31  17:08
 **/
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   protected abstract void update();

    public void change(Intermediary intermediary) {
        intermediary.operation(this);
    }
}
