package DecoratorPattern.Decorator;

import DecoratorPattern.Base.BasePizza;

// the relation between ToppingDecorator and BasePizza is a "has-a" relation as well as a "is-a" relation
// ExtraCheese has a BasePizza and ExtraCheese is a BasePizza
// its a "is-a" because it extends BasePizza class and "has-a" because it has a BasePizza object 
// (this class does not have a BasePizza object but it has a BasePizza object in inherited classes)

public abstract class ToppingDecorator extends BasePizza {

}
