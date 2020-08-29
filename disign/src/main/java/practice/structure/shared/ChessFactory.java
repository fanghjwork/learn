package practice.structure.shared;

import java.util.HashMap;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ChessFactory
 * @Description TODO
 * @date 2020/3/31  11:43
 **/
public class ChessFactory {
    private HashMap<String,Chess> map = new HashMap<>();

    private ChessFactory (){
        WhiteChess whiteChess = new WhiteChess();
        BlackChess blackChess = new BlackChess();
        map.put("white",whiteChess);
        map.put("black",blackChess);
    }

    private static ChessFactory chessFactory = new ChessFactory();

    public static ChessFactory newInstance(){
        return chessFactory;
    }

    public Chess getChess(String type){
        return map.get(type);
    }
}
