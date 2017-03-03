package decorator;

import coffee.Beverage;

/**
 * Author: bing
 * Date: 2017-03-03 11:02
 * Email: dhuzbb@163.com
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
