package practice.structure.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Pen
 * @Description TODO
 * @date 2020/3/30  20:03
 **/
public abstract class Pen {

    protected Color color;

    public Pen(Color color) {
        this.color = color;
    }

    public abstract void showPen();
}
