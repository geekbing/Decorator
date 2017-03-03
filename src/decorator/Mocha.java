package decorator;

import coffee.Beverage;

/**
 * Author: bing
 * Date: 2017-03-03 10:56
 * Email: dhuzbb@163.com
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
