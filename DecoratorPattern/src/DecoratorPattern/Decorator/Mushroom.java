package DecoratorPattern.Decorator;

import DecoratorPattern.Base.BasePizza;

// same as ExtraCheese.java
public class Mushroom  extends BasePizza {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }

}
