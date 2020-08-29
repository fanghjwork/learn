package practice.create.prototype;

import java.io.*;

/**
 * @author fhj
 * @version 1.0
 * @ClassName NewStudent
 * @Description TODO
 * @date 2020/3/30  17:22
 **/
public class NewStudent extends Student implements Serializable{

    public NewStudent() {

    }

    public NewStudent(String name, String sex, School school) {
        super(name, sex, school);
    }

    @Override
    public Student cloneStudent() throws CloneNotSupportedException {

     try {
         ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
         objectOutputStream.writeObject(this);

         ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
         ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
         return (Student) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
         e.printStackTrace();
     }

        return super.cloneStudent();
    }
}
