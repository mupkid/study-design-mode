package org.ohx.studydesignmode.factory.pizzastore.pizzastore;

import org.ohx.studydesignmode.factory.pizzastore.pizza.CheesePizza;
import org.ohx.studydesignmode.factory.pizzastore.pizza.Pizza;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.NYPizzaIngredientFactory;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
