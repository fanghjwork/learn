package practice.structure.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BlackPen
 * @Description TODO
 * @date 2020/3/30  20:05
 **/
public class HairPen extends Pen {

    public HairPen(Color color) {
        super(color);
    }

    @Override
    public void showPen() {
        this.color.setColor();
        System.out.println("绘画");
    }
}
