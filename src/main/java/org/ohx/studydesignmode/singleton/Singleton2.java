package org.ohx.studydesignmode.singleton;

/**
 * 单例模式实现2：懒汉式（同步方法）
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
