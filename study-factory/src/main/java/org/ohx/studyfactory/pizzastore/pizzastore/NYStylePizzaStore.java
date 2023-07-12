package org.ohx.studyfactory.pizzastore.pizzastore;

import org.ohx.studyfactory.pizzastore.Pizza;
import org.ohx.studyfactory.pizzastore.PizzaIngredientFactory;
import org.ohx.studyfactory.pizzastore.PizzaStore;
import org.ohx.studyfactory.pizzastore.ingredientfactory.NYPizzaIngredientFactory;
import org.ohx.studyfactory.pizzastore.pizza.CheesePizza;
import org.ohx.studyfactory.pizzastore.pizza.ClamPizza;
import org.ohx.studyfactory.pizzastore.pizza.PepperoniPizza;
import org.ohx.studyfactory.pizzastore.pizza.VeggiePizza;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }

        return pizza;
    }
}
