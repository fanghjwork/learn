package practice.structure.compsoe;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  20:15
 **/
public class Client {
    public static void main(String[] args) {
        //组合模式
        //角色，抽象构件，叶子构件，容器构件
        //透明组合和安全组合模式
        File textfile = new TextFile("text1");
        File image = new TextFile("image1");
        File imagefile = new TextFile("image2");
        Folder folder = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        folder.setFile(textfile);
        folder.setFile(imagefile);
        folder2.setFile(image);
        folder2.setFile(folder);

        folder2.kill();
    }

}
