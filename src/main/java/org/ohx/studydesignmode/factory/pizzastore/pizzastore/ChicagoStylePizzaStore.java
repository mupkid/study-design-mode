package org.ohx.studydesignmode.factory.pizzastore.pizzastore;

import org.ohx.studydesignmode.factory.pizzastore.pizza.ChicagoStyleCheesePizza;
import org.ohx.studydesignmode.factory.pizzastore.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
