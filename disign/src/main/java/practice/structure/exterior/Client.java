package practice.structure.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  11:19
 **/
public class Client {

    public static void main(String[] args) {
        //外观模式
        //角色：外观类，子系统
        Exterior exterior = new Exterior();
        exterior.operation();
    }
}
