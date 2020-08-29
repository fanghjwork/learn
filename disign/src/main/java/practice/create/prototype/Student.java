package practice.create.prototype;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Student
 * @Description TODO
 * @date 2020/3/30  17:19
 **/
public class Student implements Cloneable {

    public Student() {
    }

    private String name;

    private String sex;

    private School school;



    public Student cloneStudent() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public Student(String name, String sex, School school) {
        this.name = name;
        this.sex = sex;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", school=" + school +
                '}';
    }
}
