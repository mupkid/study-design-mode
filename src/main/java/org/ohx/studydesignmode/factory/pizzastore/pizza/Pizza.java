package org.ohx.studydesignmode.factory.pizzastore.pizza;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.Veggie.Veggies;

import java.util.ArrayList;

/**
 * @author mudkip
 * @date 2022/7/16
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    ArrayList toppings = new ArrayList();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
