package coffee;

/**
 * Author: bing
 * Date: 2017-03-03 10:50
 * Email: dhuzbb@163.com
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
