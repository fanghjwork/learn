package practice.structure.adapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adapter
 * @Description TODO
 * @date 2020/3/30  19:50
 **/
public class Adapter implements Target {

    private Calculation calculation;

    public Adapter(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public String request(String a, String b) {
        //适配参数
        String result = String.valueOf(calculation.sum(Integer.valueOf(a),Integer.valueOf(b)));
        return result;
    }
}
