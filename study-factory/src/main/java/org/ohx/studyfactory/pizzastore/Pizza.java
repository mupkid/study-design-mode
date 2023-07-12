package org.ohx.studyfactory.pizzastore;

import org.ohx.studyfactory.pizzastore.ingredient.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    protected List toppings = new ArrayList();

    abstract public void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official Pizza Store box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
