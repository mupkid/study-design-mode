package org.ohx.studydesignmode.singleton;

/**
 * @author mudkip
 * @date 2022/7/16
 */
public class Singleton5 {
    private static Singleton5 instance;

    static {
        instance = new Singleton5();
    }

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton5 instance1 = getInstance();
        Singleton5 instance2 = getInstance();
        System.out.println(instance1 == instance2);
        System.out.printf("%s\t%s", instance1.hashCode(), instance2.hashCode());
    }
}
