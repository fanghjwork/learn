package practice.create.factory.abstruact;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryRefrigerator
 * @Description TODO
 * @date 2020/3/30  16:55
 **/
public class OrdinaryRefrigerator implements Refrigerator{
    @Override
    public void show() {
        System.out.println("ordinary refrigerator");
    }
}
