package org.ohx.studydesignmode.factory.pizzastore.pizzaingredient;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.cheese.ReggianoCheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.clam.FreshClams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.dough.ThinCrustDough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.pepperoni.SlicedPepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.sauce.MarinaraSauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.veggie.*;

/**
 * 纽约披萨原料工厂
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public NYPizzaIngredientFactory() {
        super();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPaper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
