package practice.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Text
 * @Description TODO
 * @date 2020/3/31  17:18
 **/
public class Text extends Component {
    public Text(String name) {
        super(name);
    }

    @Override
    protected void update() {
        System.out.println("text update");
    }
}
