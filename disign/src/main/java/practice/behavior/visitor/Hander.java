package practice.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/4/1  10:50
 **/
public class Hander {

    private List<Employee> list = new ArrayList<>();

    public void setEmployee(Employee employee){
        list.add(employee);
    }

    public void getEmployee(int index){
        list.get(index);
    }

    public void execute(Visitor visitor){
        for (Employee employee : list) {
             employee.visit(visitor);
        }
    }

}
