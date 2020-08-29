package practice.structure.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName exterior
 * @Description TODO
 * @date 2020/3/31  11:21
 **/
public class Exterior {

    private Water water;

    private TeaService teaService;

    private Tea tea ;

    public Exterior() {
        this.water  = new Water();
        this.teaService = new TeaService();
        this.tea  = new Tea();
    }

    public void operation(){
        this.water.ready();
        this.teaService.ready();
        this.tea.ready();
        System.out.println("make tea");
    }
}
