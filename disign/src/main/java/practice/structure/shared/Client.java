package practice.structure.shared;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/31  11:31
 **/
public class Client {

    public static void main(String[] args) {
        //享元模式
        //角色，抽象享元类，具体享元类，非共享具体享元类，享元工厂
        ChessFactory chessFactory = ChessFactory.newInstance();
        Chess white = chessFactory.getChess("white");
        Chess black = chessFactory.getChess("black");

        white.operation(new Coordinate(1,1));
        black.operation(new Coordinate(2,1));
    }
}
