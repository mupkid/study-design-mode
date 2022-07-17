package org.ohx.studydesignmode.factory.pizzastore.pizzaingredient;

import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.cheese.Cheese;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.clam.Clams;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.dough.Dough;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.pepperoni.Pepperoni;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.sauce.Sauce;
import org.ohx.studydesignmode.factory.pizzastore.pizzaingredient.veggie.Veggies;

/**
 * 披萨原料工厂
 *
 * @author mudkip
 * @date 2022/7/16
 */
public interface PizzaIngredientFactory {
    /**
     * 创建面团
     *
     * @return 面团
     */
    public Dough createDough();

    /**
     * 创建酱料
     *
     * @return 酱料
     */
    public Sauce createSauce();

    /**
     * 创建芝士
     *
     * @return 芝士
     */
    public Cheese createCheese();

    /**
     * 创建蔬菜
     *
     * @return 蔬菜
     */
    public Veggies[] createVeggies();

    /**
     * 创建香肠
     *
     * @return 香肠
     */
    public Pepperoni createPepperoni();

    /**
     * 创建蛤蜊
     *
     * @return 蛤蜊
     */
    public Clams createClam();
}
