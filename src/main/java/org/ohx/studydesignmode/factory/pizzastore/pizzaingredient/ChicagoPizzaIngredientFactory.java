package org.ohx.studydesignmode.factory.pizzastore.pizzaingredient;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.cheese.Mozzarella;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.clam.FrozenClams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.dough.ThinCrustDough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.pepperoni.SlicedPepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.sauce.PlumTomatoSauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.veggie.BlackOlives;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.veggie.EggPlant;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.veggie.Spinach;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.veggie.Veggies;

/**
 * 芝加哥披萨原料工厂
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
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
        Veggies veggies[] = {new Spinach(), new EggPlant(), new BlackOlives()};
        return veggies;
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
