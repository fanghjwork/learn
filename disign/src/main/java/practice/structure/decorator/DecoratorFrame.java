package practice.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DecoratorFrame
 * @Description TODO
 * @date 2020/3/31  11:11
 **/
public class DecoratorFrame extends Decorator {
    public DecoratorFrame(Component component) {
        super(component);
    }

    @Override
    public void show() {
        decoratorComponent();
        super.show();
    }

    public void decoratorComponent() {
        System.out.println("set black frame");
    }
}
