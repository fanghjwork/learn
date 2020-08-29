package practice.behavior.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName NormalEmployee
 * @Description TODO
 * @date 2020/4/1  10:34
 **/
public class NormalEmployee extends Employee{

    private double day;

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public NormalEmployee(String name, double day) {
        super(name);
        this.day = day;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
