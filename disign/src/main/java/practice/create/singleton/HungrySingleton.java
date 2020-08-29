package practice.create.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName HungrySingleton
 * @Description TODO
 * @date 2020/3/30  17:12
 **/
public class HungrySingleton {

    private HungrySingleton (){};

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton newInstance(){
        return hungrySingleton;
    }
}
