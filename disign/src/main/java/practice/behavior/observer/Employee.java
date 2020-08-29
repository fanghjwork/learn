package practice.behavior.observer;


/**
 * @author fhj
 * @version 1.0
 * @ClassName Employee
 * @Description TODO
 * @date 2020/3/31  20:07
 **/
public class Employee extends Observer {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println(this.getName()+" 来支援");
    }

}
