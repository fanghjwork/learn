package practice.create.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LazySingleton
 * @Description TODO
 * @date 2020/3/30  17:07
 **/
public class LazySingleton {

    private LazySingleton (){};

    static class InternalSingleton{
        private static LazySingleton lazySingleton = new LazySingleton();
    }

    public static LazySingleton newInstance(){
        return InternalSingleton.lazySingleton;
    }
}
