package org.ohx.studydesignmode.factory;

import org.junit.jupiter.api.Test;
import org.ohx.studydesignmode.factory.pizzastore.pizza.Pizza;
import org.ohx.studydesignmode.factory.pizzastore.pizzastore.NYStylePizzaStore;
import org.ohx.studydesignmode.factory.pizzastore.pizzastore.PizzaStore;

/**
 * 披萨店测试类
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class PizzaStoreTest {
    @Test
    public void Test1() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
