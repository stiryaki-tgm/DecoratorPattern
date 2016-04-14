/**
 * Created by Seyyid Tiryaki on 14.04.2016.
 */
public class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

     public double cost()
     {
        return beverage.cost() + 0.5;
     }

    public String getDescription()
    {
        return beverage.getDescription()+",Milk";
    }
}
