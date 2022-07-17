package org.ohx.studydesignmode.factory.pizzastore.pizza;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.PizzaIngredientFactory;

/**
 * 香肠披萨
 *
 * @author mudkip
 * @date 2022/7/17
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
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
