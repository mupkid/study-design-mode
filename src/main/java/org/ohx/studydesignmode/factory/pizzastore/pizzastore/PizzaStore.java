package org.ohx.studydesignmode.factory.pizzastore.pizzastore;

import org.ohx.studydesignmode.factory.pizzastore.pizza.Pizza;

/**
 * 披萨店
 *
 * @author mudkip
 * @date 2022/7/16
 */
public abstract class PizzaStore {
    /**
     * 下单披萨
     *
     * @param type 披萨的类型
     * @return 披萨
     */
    public Pizza orderPizza(String type) {
        // 把创建披萨的任务交给工厂
        Pizza pizza = createPizza(type);

        // 准备
        pizza.prepare();
        // 烘烤
        pizza.bake();
        // 切片
        pizza.cut();
        // 打包
        pizza.box();

        return pizza;
    }

    /**
     * 根据披萨的类型返回对应的披萨
     * <p>
     * 工厂方法，让子类实现此方法制造属于自己的产品
     *
     * @param type 披萨的类型
     * @return 披萨
     */
    abstract Pizza createPizza(String type);
}
