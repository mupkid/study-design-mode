package org.ohx.studyfactory.pizzastore;

import org.ohx.studyfactory.pizzastore.pizzastore.ChicagoStylePizzaStore;
import org.ohx.studyfactory.pizzastore.pizzastore.NYStylePizzaStore;

/**
 * @author mudkip
 * @date 2023/7/9
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
