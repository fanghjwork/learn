package practice.structure.compsoe;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TextFile
 * @Description TODO
 * @date 2020/3/30  20:21
 **/
public class TextFile extends File {


    public TextFile(String name) {
        super(name);
    }

    @Override
    public void kill() {
        System.out.println(super.getName()+" textFile kill");
    }
}
