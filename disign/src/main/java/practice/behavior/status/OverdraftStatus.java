package practice.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OverdraftStatus
 * @Description TODO
 * @date 2020/3/31  21:25
 **/
public class OverdraftStatus extends Status {

    public OverdraftStatus(Context context) {
        super(context);
    }

    @Override
    public void switchStatus() {
        if(this.context.getAccount().getMoney() >= 0){
            context.setStatus(new NormalStatus(this.context));
        }else if(this.context.getAccount().getMoney()< -1000){
            context.setStatus(new RestrictedStatus(this.context));
        }
    }
}
