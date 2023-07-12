package org.ohx.studyfactory.pizzastore.ingredientfactory;

import org.ohx.studyfactory.pizzastore.PizzaIngredientFactory;
import org.ohx.studyfactory.pizzastore.ingredient.*;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new EggPlant(), new Spinach()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
