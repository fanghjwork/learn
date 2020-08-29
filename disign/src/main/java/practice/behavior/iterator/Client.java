package practice.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  16:58
 **/
public class Client {

    public static void main(String[] args) {
        //迭代器模式
        //抽象聚合类，具体聚合类，抽象迭代器，具体迭代器
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //迭代
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
