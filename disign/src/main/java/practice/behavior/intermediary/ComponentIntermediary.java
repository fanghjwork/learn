package practice.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ComponentIntermediary
 * @Description TODO
 * @date 2020/3/31  17:11
 **/
public class ComponentIntermediary implements Intermediary {

    private List list ;

    private Combobox combobox;

    private Text text;

    public ComponentIntermediary(List list, Combobox combobox, Text text) {
        this.list = list;
        this.combobox = combobox;
        this.text = text;
    }

    @Override
    public void operation(Component component) {
        if(this.list == component){
            list.select();
            combobox.update();
            text.update();
            System.out.println("===================");
        }else if(this.combobox == component){
            combobox.select();
            list.update();
            text.update();
            System.out.println("===================");
        }else if(this.text == component){
            text.update();
            System.out.println("===================");
        }
    }
}
