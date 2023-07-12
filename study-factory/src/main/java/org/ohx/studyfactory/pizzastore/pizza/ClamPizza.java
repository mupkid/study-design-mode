package org.ohx.studyfactory.pizzastore.pizza;

import org.ohx.studyfactory.pizzastore.Pizza;
import org.ohx.studyfactory.pizzastore.PizzaIngredientFactory;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
