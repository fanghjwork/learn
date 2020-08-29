package practice.behavior.prototype;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020/4/1  10:06
 **/
public class Context {

    private Calculation calculation;
    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public void execute(){
        this.calculation.execute();
    }
}
