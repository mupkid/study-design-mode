package org.ohx.studytemplatemethod.coffeeshop.after;

/**
 * @author mudkip
 * @date 2023/7/16
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
