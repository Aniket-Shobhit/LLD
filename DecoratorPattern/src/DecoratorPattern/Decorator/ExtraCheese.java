package DecoratorPattern.Decorator;

import DecoratorPattern.Base.BasePizza;

// the relation is a "is-a" relation as ExtraCheese inherits ToppingDecorator
// ExtraCheese is a ToppingDecorator
public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
