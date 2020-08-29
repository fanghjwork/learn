package practice.behavior.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName XMLData
 * @Description TODO
 * @date 2020/4/1  10:22
 **/
public class XMLData extends Display {
    @Override
    protected void getdata() {
        System.out.println("get xmlData");
    }

    @Override
    protected void conversionXMLData() {
        System.out.println("conversion xmlData");
    }

    @Override
    protected boolean isXMLData() {
        return true;
    }

    @Override
    protected void show() {
        System.out.println("柱状图显示");
    }
}
