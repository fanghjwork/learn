package practice.behavior.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Visitor
 * @Description TODO
 * @date 2020/4/1  10:40
 **/
public interface Visitor {

    void visit(NormalEmployee normalEmployee);

    void visit(TemporaryEmployee temporaryEmployee);
}
