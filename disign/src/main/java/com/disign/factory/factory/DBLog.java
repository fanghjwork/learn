package com.disign.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FileLog
 * @Description TODO
 * @date 2019/8/21  9:39
 **/
public class DBLog implements Log {
    @Override
    public void writeLog(String str) {

        System.out.println( "DBLog :"+str);

    }
}
