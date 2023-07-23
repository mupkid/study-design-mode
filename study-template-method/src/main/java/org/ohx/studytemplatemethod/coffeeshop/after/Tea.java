package org.ohx.studytemplatemethod.coffeeshop.after;

/**
 * @author mudkip
 * @date 2023/7/16
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
