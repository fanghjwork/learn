package practice.behavior.observer.version2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Player
 * @Description TODO
 * @date 2020/3/31  20:34
 **/
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Player player = (Player) arg;
        if(this.name != player.getName()){
            System.out.println(this.name+" 来支援了");
        }
    }

    public void help(Chan chan){
        System.out.println(this.name+" 被攻击了");
        chan.operation(this);
    }
}
