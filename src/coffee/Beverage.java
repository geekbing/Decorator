package coffee;

/**
 * Author: bing
 * Date: 2017-03-03 10:39
 * Email: dhuzbb@163.com
 */
public abstract class Beverage {
    String description = "Unknown coffee.Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
