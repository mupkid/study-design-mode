package org.ohx.studysingleton;

/**
 * 单例模式实现3：懒汉式（同步代码块）
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class Singleton3 {
    private static Singleton3 uniqueInstance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                uniqueInstance = new Singleton3();
            }
        }
        return uniqueInstance;
    }
}
