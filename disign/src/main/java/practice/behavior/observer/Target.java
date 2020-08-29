package practice.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Target
 * @Description TODO
 * @date 2020/3/31  19:57
 **/
public abstract class Target {

    private String name;

    protected List<Observer> list = new ArrayList<>();

    public void setList(Observer observer) {
        this.list.add(observer);
    }

    public Target(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void notifyObservers(Observer observer);


}
