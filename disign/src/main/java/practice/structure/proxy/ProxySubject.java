package practice.structure.proxy;

import com.version2.structure.proxy.RealSubject;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProxySubject
 * @Description TODO
 * @date 2020/3/31  12:11
 **/
public class ProxySubject implements Subject{

    private Calculation calculation = new Calculation();

    @Override
    public String calculation(String user,String password) {
        pre(user,password);
        if(!checkUser(user,password)){
            System.out.println("username or password error");
        }
       String result = calculation.operation();
        post(result);
        return result;
    }

    private boolean checkUser(String user,String password){
        if("admin".equals(user) && "admin".equals(password)){
            return true;
        }
        return false;
    }

    private void pre(String user,String password){
        System.out.println("入参记录：user="+user+" password="+password);
    }

    private void post(String result){
        System.out.println("结果记录：result="+result);
    }
}
