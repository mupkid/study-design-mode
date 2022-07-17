package org.ohx.studydesignmode.factory.pizzastore.pizza;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.PizzaIngredientFactory;

/**
 * 蔬菜披萨
 *
 * @author mudkip
 * @date 2022/7/17
 */
public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
