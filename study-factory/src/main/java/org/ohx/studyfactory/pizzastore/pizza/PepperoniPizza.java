package org.ohx.studyfactory.pizzastore.pizza;

import org.ohx.studyfactory.pizzastore.Pizza;
import org.ohx.studyfactory.pizzastore.PizzaIngredientFactory;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
