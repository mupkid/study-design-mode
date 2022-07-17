package org.ohx.studydesignmode.factory.pizzastore.pizzastore;

import org.ohx.studydesignmode.factory.pizzastore.pizza.CheesePizza;
import org.ohx.studydesignmode.factory.pizzastore.pizza.Pizza;
import org.ohx.studydesignmode.factory.pizzastore.pizza.VeggiePizza;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.NYPizzaIngredientFactory;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.PizzaIngredientFactory;

/**
 * 纽约风味的披萨店
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(item)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("pepperoni".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if ("clam".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
