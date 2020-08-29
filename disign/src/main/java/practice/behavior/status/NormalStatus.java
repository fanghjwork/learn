package practice.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName NormalStatus
 * @Description TODO
 * @date 2020/3/31  21:07
 **/
public class NormalStatus extends Status {


    public NormalStatus(Context context) {
        super(context);
    }

    @Override
    public void calculation() {
        System.out.println("not calculation");
    }

    @Override
    public void switchStatus() {
        if(this.context.getAccount().getMoney()< 0 && this.context.getAccount().getMoney() >= -1000){
            context.setStatus(new OverdraftStatus(this.context));
        }else if(this.context.getAccount().getMoney()< -1000){
            context.setStatus(new RestrictedStatus(this.context));
        }
    }
}
