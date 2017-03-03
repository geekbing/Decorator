package decorator;

import coffee.Beverage;

/**
 * Author: bing
 * Date: 2017-03-03 11:00
 * Email: dhuzbb@163.com
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
