package org.ohx.studysingleton;

/**
 * 单例模式实现4：饿汉式（静态常量）
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class Singleton4 {
    private final static Singleton4 instance = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton4 instance1 = getInstance();
        Singleton4 instance2 = getInstance();
        System.out.println(instance1 == instance2);
        System.out.printf("%s\t%s", instance1.hashCode(), instance2.hashCode());
    }
}
