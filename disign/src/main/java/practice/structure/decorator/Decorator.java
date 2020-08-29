package practice.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Decorator
 * @Description TODO
 * @date 2020/3/31  11:08
 **/
public  class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        this.component.show();
    }
}
