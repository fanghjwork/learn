package practice.create.prototype;

/**
 * @author fhj
 * @version 1.0
 * @ClassName School
 * @Description TODO
 * @date 2020/3/30  17:18
 **/
public class School {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }

    public School(String name) {
        this.name = name;
    }
}
