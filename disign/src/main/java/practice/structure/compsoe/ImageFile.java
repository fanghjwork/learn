package practice.structure.compsoe;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ImageFile
 * @Description TODO
 * @date 2020/3/30  20:21
 **/
public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void kill() {
        System.out.println(super.getName()+" imageFile kill ");
    }
}
