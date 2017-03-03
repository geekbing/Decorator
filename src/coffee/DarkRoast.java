package coffee;

/**
 * Author: bing
 * Date: 2017-03-03 10:53
 * Email: dhuzbb@163.com
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
