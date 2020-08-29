package practice.structure.shared;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Chess
 * @Description TODO
 * @date 2020/3/31  11:37
 **/
public abstract class Chess {


    public abstract String getChessColor();

    public void operation(Coordinate coordinate){
        System.out.println(getChessColor()+" : x="+coordinate.getX()+" y="+coordinate.getY());
    }
}
