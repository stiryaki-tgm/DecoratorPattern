/**
 * Created by Seyyid Tiryaki on 14.04.2016.
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public double cost()
    {
        return beverage.cost() + 0.5;
    }

    public String getDescription()
    {
        return beverage.getDescription()+",Soy";
    }
}
