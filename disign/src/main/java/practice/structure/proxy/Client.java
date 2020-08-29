package practice.structure.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  12:07
 **/
public class Client {

    public static void main(String[] args) {
        //代理模式
        //角色：抽象主题，代理主题，真实主题

        //智能引用+保护代理
        Subject subject = new ProxySubject();
        String result = subject.calculation("admin","admin");
        System.out.println("result is "+result);
    }
}
