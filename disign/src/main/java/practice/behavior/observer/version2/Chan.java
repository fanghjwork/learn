package practice.behavior.observer.version2;

import java.util.Observable;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Chan
 * @Description TODO
 * @date 2020/3/31  20:27
 **/
public class Chan extends Observable {

    private String name;

    public Chan(String name) {
        this.name = name;
    }

    public void operation(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }
}
