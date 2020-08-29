package practice.behavior.visitor;

import java.sql.Time;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TemporaryEmployee
 * @Description TODO
 * @date 2020/4/1  10:35
 **/
public class TemporaryEmployee extends Employee {

    private double time;

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public TemporaryEmployee(String name, double time) {
        super(name);
        this.time = time;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
