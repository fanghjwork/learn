package practice.create.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  17:07
 **/
public class Client {

    public static void main(String[] args) {
        //单例模式
        //角色，单例类、


        //饿汉式
        HungrySingleton hungrySingleton = HungrySingleton.newInstance();
        HungrySingleton hungrySingleton1 = HungrySingleton.newInstance();
        System.out.println(hungrySingleton == hungrySingleton1);
        System.out.println("+++++++++++++++++++++++++");

        //懒汉式

        LazySingleton lazySingleton = LazySingleton.newInstance();
        LazySingleton lazySingleton1 = LazySingleton.newInstance();
        System.out.println(lazySingleton == lazySingleton1);
    }
}
