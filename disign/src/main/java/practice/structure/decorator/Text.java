package practice.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Text
 * @Description TODO
 * @date 2020/3/31  11:08
 **/
public class Text implements Component {
    @Override
    public void show() {
        System.out.println("this text");
    }
}
