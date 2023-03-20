package org.ohx.studysingleton;

/**
 * 单例模式实现7：静态内部类
 * 静态内部类特点：
 * 1、外部类被加载时，内部类不会跟着加载
 * 2、
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class Singleton7 {
    private static class SingletonHolder {
        private static final Singleton7 uniqueInstance = new Singleton7();
    }

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        return SingletonHolder.uniqueInstance;
    }
}
