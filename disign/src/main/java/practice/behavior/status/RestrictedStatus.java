package practice.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RestrictedStatus
 * @Description TODO
 * @date 2020/3/31  21:27
 **/
public class RestrictedStatus extends Status {
    public RestrictedStatus(Context context) {
        super(context);
    }



    @Override
    public void take(double money) {
        System.out.println("is restricted");
    }

    @Override
    public void switchStatus() {
        if(this.context.getAccount().getMoney() >= 0){
            context.setStatus(new NormalStatus(this.context));
        }else if(this.context.getAccount().getMoney()< 0 && this.context.getAccount().getMoney() >= -1000){
            context.setStatus(new OverdraftStatus(this.context));
        }
    }
}
