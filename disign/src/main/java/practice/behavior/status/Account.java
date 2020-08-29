package practice.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Account
 * @Description TODO
 * @date 2020/3/31  21:04
 **/
public class Account {

    private String name;

    private double money = 0;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
