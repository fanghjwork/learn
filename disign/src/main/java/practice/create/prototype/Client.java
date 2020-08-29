package practice.create.prototype;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  17:16
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        //原型模式
        //角色，抽象原型类，具体原型类

        //浅克隆
        School school = new School("清华大学");
        Student student = new Student("tim","male",school);
        Student student1 = student.cloneStudent();
        System.out.println(student == student1);
        System.out.println(student.getName() == student1.getName());
        System.out.println(student.getSchool() == student1.getSchool());
        System.out.println("=============================String 也是 同一个");

        //深克隆
        Student newStudent = new NewStudent("tim","male",school);
        Student newStudent1 = newStudent.cloneStudent();
        System.out.println(newStudent == newStudent1);
        System.out.println(newStudent.getName() == newStudent1.getName());
        System.out.println(newStudent.getSchool() == newStudent1.getSchool());
    }
}
