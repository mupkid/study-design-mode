package org.ohx.studydesignmode.factory.pizzastore.pizzaingredient;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Veggie.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
