package practice.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/3/31  15:12
 **/
public abstract class Hander {

    private Hander hander;

    public Hander getHander() {
        return hander;
    }

    public void setHander(Hander hander) {
        this.hander = hander;
    }

    public abstract  void operation(Employee employee);

}
