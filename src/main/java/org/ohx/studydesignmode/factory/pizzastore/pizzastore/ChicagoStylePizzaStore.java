package org.ohx.studydesignmode.factory.pizzastore.pizzastore;

import org.ohx.studydesignmode.factory.pizzastore.pizza.CheesePizza;
import org.ohx.studydesignmode.factory.pizzastore.pizza.Pizza;
import org.ohx.studydesignmode.factory.pizzastore.pizza.VeggiePizza;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.ChicagoPizzaIngredientFactory;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.PizzaIngredientFactory;

/**
 * 芝加哥风味的披萨店
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if ("cheese".equals(item)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if ("pepperoni".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if ("clam".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
