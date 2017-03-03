package decorator;

import coffee.Beverage;

/**
 * Author: bing
 * Date: 2017-03-03 10:59
 * Email: dhuzbb@163.com
 */
public class Whip extends  CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
