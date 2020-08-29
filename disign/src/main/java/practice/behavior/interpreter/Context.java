package practice.behavior.interpreter;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020/3/31  15:57
 **/
public class Context {

    private StringTokenizer stringTokenizer;

    private String value;

    public Context(String value) {
        this.stringTokenizer = new StringTokenizer(value);
    }

    public boolean hasNext(){
        return this.stringTokenizer.hasMoreTokens();
    }

    public String current(){
        return this.value;
    }

    public String next(){
        if(hasNext()){
            this.value = this.stringTokenizer.nextToken();
            return this.value;
        }
        return null;
    }
}
