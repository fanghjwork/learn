package practice.structure.compsoe;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Component
 * @Description TODO
 * @date 2020/3/30  20:19
 **/
public abstract class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void kill();
}
