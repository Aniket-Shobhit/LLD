import DecoratorPattern.Base.BasePizza;
import DecoratorPattern.Base.Farmhouse;
import DecoratorPattern.Base.Margherita;
import DecoratorPattern.Base.VegDelight;
import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.Mushroom;

public class App {
    public static void main(String args[]) {

        BasePizza pizza1 = new ExtraCheese(new Mushroom(new Farmhouse()));
        System.out.println("Cost of Farmhouse Pizza with Mushroom and Extra Cheese: " + pizza1.cost());

        BasePizza pizza2 = new ExtraCheese(new Mushroom(new VegDelight()));
        System.out.println("Cost of VegDelight Pizza with Mushroom and Extra Cheese: " + pizza2.cost());

        BasePizza pizza3 = new ExtraCheese(new Mushroom(new Margherita()));
        System.out.println("Cost of Margherita Pizza with Mushroom and Extra Cheese: " + pizza3.cost());

        BasePizza pizza4 = new ExtraCheese(new Mushroom(new Mushroom(new Farmhouse())));
        System.out.println("Cost of Farmhouse Pizza with 2 Mushrooms and Extra Cheese: " + pizza4.cost());

    }
}