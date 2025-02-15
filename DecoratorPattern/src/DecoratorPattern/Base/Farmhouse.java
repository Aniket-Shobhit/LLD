package DecoratorPattern.Base;

// is-a relation is implemented using inheritance
// its a "is-a" relation between farmhouse and basePizza class
public class Farmhouse extends BasePizza {
    
    @Override
    public int cost() {
        return 200;
    }

}
