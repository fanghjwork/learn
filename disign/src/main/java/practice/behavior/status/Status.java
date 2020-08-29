package practice.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Status
 * @Description TODO
 * @date 2020/3/31  21:06
 **/
public abstract class Status {

    protected Context context;

    public Status(Context context) {
        this.context = context;
    }


    public void save(double money) {
        this.context.getAccount().setMoney(this.context.getAccount().getMoney()+ money);
        switchStatus();
    }

    public void take(double money) {
        this.context.getAccount().setMoney(this.context.getAccount().getMoney() - money);
        switchStatus();
    }


    public void calculation() {
        System.out.println("overdraft calculation");
    }

    public abstract void switchStatus();
}
