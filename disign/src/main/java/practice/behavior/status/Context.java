package practice.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020/3/31  21:17
 **/
public class Context {

    private Status status;

    private Account account;

    public Context(Account account) {
        status = new NormalStatus(this);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void save(double money){
        status.save(money);
        System.out.println("money "+account.getMoney());
        System.out.println("status "+status.getClass().getSimpleName());
        System.out.println("=================");
    }

    public void take(double money){
        status.take(money);
        System.out.println("money "+account.getMoney());
        System.out.println("status "+status.getClass().getSimpleName());
        System.out.println("=================");
    }

    public void calculation(){
        status.calculation();
        System.out.println("money "+account.getMoney());
        System.out.println("status "+status.getClass().getSimpleName());
        System.out.println("=================");
    }
}
