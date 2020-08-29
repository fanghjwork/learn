package practice.behavior.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName template
 * @Description TODO
 * @date 2020/4/1  10:11
 **/
public abstract class Display {

    protected abstract  void getdata();

    protected void conversionXMLData(){};

    protected abstract void show();

    protected boolean isXMLData(){
        return false;
    }

    public void templateMethod(){
        getdata();
        if(isXMLData()){
            conversionXMLData();
        }
        show();
    }
}
