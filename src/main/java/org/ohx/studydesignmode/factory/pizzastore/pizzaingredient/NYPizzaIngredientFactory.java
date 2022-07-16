package org.ohx.studydesignmode.factory.pizzastore.pizzaingredient;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Cheese.ReggianoCheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Clam.FreshClams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Dough.ThinCrustDough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Pepperoni.SlicedPepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Sauce.MarinaraSauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Veggie.*;

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
        Veggies veggies[]={new Garlic(),new Onion(),new Mushroom(),new RedPaper()};
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
