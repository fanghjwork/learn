package practice.behavior.observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Observer
 * @Description TODO
 * @date 2020/3/31  19:58
 **/
public abstract class Observer {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract void update();

    public void help(Target target){
        System.out.println(getName()+"被攻击了");
        target.notifyObservers(this);
    }
}
