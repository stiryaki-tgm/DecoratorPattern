/**
 * Created by Seyyid Tiryaki on 14.04.2016.
 */
public abstract class Beverage {

    protected String description;

    public Beverage()
    {

    }

    public String getDescription()
    {
        return description;
    }

    abstract double cost();
}
