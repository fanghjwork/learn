package practice.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName List
 * @Description TODO
 * @date 2020/3/31  17:09
 **/
public class List extends Component {

    public List(String name) {
        super(name);
    }

    @Override
    protected void update() {
        System.out.println("list update");
    }

    protected void select(){
        System.out.println("list select");
    }
}
