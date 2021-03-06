package com.version2.structure.adapter.objectadapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SumAdapter
 * @Description TODO
 * @date 2020/3/18  17:42
 **/
public class SumAdapter implements Target{

    //组合
    private Calculation calculation;

    public SumAdapter(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public String request(String arg1,String arg2) {
        //适配参数不一致情况
        double sum = this.calculation.sum(Double.valueOf(arg1),Double.valueOf(arg2));
        return String.valueOf(sum);
    }
}
