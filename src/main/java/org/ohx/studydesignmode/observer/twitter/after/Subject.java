package org.ohx.studydesignmode.observer.twitter.after;

import java.util.ArrayList;

/**
 * 发布者
 *
 * @author haoxian, ou
 * @date 2021/7/28 0:28
 */
public class Subject {
    protected ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 添加“观察者“
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除“观察者”
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有“观察者”
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            // 此处只需要调用“观察者”提供的通知函数
            // 并不需要知道“观察者”具体需要做什么
            observer.update();
        }
    }
}
