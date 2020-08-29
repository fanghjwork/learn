package practice.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  17:03
 **/
public class Client {

    public static void main(String[] args) {
        //中介者模式，
        //角色，抽象中介者，具体中介者，抽象同事类，具体同事类

        List list  = new List("list");
        Combobox combobox = new Combobox("combobox");
        Text text = new Text("text");

        Intermediary intermediary = new ComponentIntermediary(list,combobox,text);

        list.change(intermediary);
        combobox.change(intermediary);
        text.change(intermediary);


    }
}
