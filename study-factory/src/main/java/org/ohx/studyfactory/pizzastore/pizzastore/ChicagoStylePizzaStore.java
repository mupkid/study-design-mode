package org.ohx.studyfactory.pizzastore.pizzastore;

import org.ohx.studyfactory.pizzastore.Pizza;
import org.ohx.studyfactory.pizzastore.PizzaStore;
import org.ohx.studyfactory.pizzastore.pizza.ChicagoStyleCheesePizza;
import org.ohx.studyfactory.pizzastore.pizza.ChicagoStyleClamPizza;
import org.ohx.studyfactory.pizzastore.pizza.ChicagoStylePepperoniPizza;
import org.ohx.studyfactory.pizzastore.pizza.ChicagoStyleVeggiePizza;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
