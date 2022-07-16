package org.ohx.studydesignmode.factory.pizzastore.pizzaingredient;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Cheese.Mozzarella;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Clam.FrozenClams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Dough.ThinCrustDough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Pepperoni.SlicedPepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Sauce.PlumTomatoSauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Veggie.BlackOlives;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Veggie.EggPlant;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Veggie.Spinach;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Veggie.Veggies;

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
        Veggies veggies[] ={new Spinach(),new EggPlant(),new BlackOlives()};
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
