package practice.behavior.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Employee
 * @Description TODO
 * @date 2020/4/1  10:30
 **/
public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visit(Visitor visitor);
}
