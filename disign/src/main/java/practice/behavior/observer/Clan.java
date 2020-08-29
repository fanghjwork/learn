package practice.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Clan
 * @Description TODO
 * @date 2020/3/31  20:01
 **/
public class Clan extends Target {

    public Clan(String name) {
        super(name);
    }

    @Override
    public void notifyObservers(Observer obs) {
        for (Observer observer : super.list) {
            if(obs != observer) {
                observer.update();
            }
        }
    }
}
