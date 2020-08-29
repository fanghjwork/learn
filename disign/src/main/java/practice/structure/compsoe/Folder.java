package practice.structure.compsoe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Folder
 * @Description TODO
 * @date 2020/3/30  20:22
 **/
public class Folder extends File {

    private List<File> list = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void setFile(File file){
        list.add(file);
    }

    public File getFile(int index){
        return list.get(index);
    }

    @Override
    public void kill() {
        System.out.println(super.getName()+" folder kill");
        for (File file : list) {
            file.kill();
        }
    }
}
