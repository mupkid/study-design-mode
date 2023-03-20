package org.ohx.studysingleton;

/**
 * 单例模式实现1：懒汉式（静态常量）
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
