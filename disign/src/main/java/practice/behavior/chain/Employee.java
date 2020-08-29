package practice.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Employee
 * @Description TODO
 * @date 2020/3/31  15:14
 **/
public class Employee {

    private String name;

    private int day;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", day=" + day +
                '}';
    }

    public Employee(String name, int day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
