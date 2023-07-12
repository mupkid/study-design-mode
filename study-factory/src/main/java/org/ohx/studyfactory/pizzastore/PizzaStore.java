package org.ohx.studyfactory.pizzastore;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
//        Pizza pizza = SimplePizzaFactory.createPizza(type);
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract protected Pizza createPizza(String type);
}
