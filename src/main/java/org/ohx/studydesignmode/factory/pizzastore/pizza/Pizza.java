package org.ohx.studydesignmode.factory.pizzastore.pizza;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.veggie.Veggies;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 披萨
 *
 * @author mudkip
 * @date 2022/7/16
 */
public abstract class Pizza {
    /**
     * 披萨名
     */
    protected String name;

    /**
     * 面团
     */
    protected Dough dough;

    /**
     * 酱料
     */
    protected Sauce sauce;

    /**
     * 蔬菜
     */
    protected Veggies veggies[];

    /**
     * 芝士
     */
    protected Cheese cheese;

    /**
     * 香肠
     */
    protected Pepperoni pepperoni;

    /**
     * 蛤蜊
     */
    protected Clams clam;

    protected ArrayList toppings = new ArrayList();

    /**
     * 披萨准备，在这里收集披萨所需要的原料，不同披萨原料不同，因此声明为抽象方法
     */
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
        return "Pizza{" +
            "name='" + name + '\'' +
            ", dough=" + dough +
            ", sauce=" + sauce +
            ", veggies=" + Arrays.toString(veggies) +
            ", cheese=" + cheese +
            ", pepperoni=" + pepperoni +
            ", clam=" + clam +
            ", toppings=" + toppings +
            '}';
    }
}
