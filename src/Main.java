/**
 * Created by Seyyid Tiryaki on 14.04.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        Beverage bev = new Espresso();
        bev = new Milk(bev);
        bev = new Soy(bev);
        System.out.println(bev.getDescription());
        System.out.println(bev.cost());
    }
}
