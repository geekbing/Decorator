package coffee;

/**
 * Author: bing
 * Date: 2017-03-03 10:52
 * Email: dhuzbb@163.com
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "coffee.Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
