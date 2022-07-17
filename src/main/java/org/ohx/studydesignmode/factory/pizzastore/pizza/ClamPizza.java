package org.ohx.studydesignmode.factory.pizzastore.pizza;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.PizzaIngredientFactory;

/**
 * 蛤蜊披萨
 *
 * @author mudkip
 * @date 2022/7/17
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
