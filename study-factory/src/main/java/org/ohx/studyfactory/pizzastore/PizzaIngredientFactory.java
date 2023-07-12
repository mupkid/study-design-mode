package org.ohx.studyfactory.pizzastore;

import org.ohx.studyfactory.pizzastore.ingredient.*;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
