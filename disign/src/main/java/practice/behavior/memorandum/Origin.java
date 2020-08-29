package practice.behavior.memorandum;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Primer
 * @Description TODO
 * @date 2020/3/31  17:35
 **/
public class Origin {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void operationValue(String value){
        this.value =value;
    }

    public Memorandum save(){

        Memorandum memorandum = new Memorandum();
        memorandum.setValue(value);
        return memorandum;
    }

    public void back(Memorandum memorandum){
        this.value = memorandum.getValue();
    }
}
