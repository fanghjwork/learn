package practice.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Combobox
 * @Description TODO
 * @date 2020/3/31  17:16
 **/
public class Combobox extends Component {

    public Combobox(String name) {
        super(name);
    }

    @Override
    protected void update() {
        System.out.println("combobox update");
    }

    protected void select(){
        System.out.println("combobox select");
    }
}
