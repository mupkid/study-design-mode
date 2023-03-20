package org.ohx.studysingleton;

/**
 * 单例模式实现6：双重校验锁
 *
 * @author mudkip
 * @date 2022/7/16
 */
public class Singleton6 {
    /**
     * volatile确保：当uniqueInstance变量被初始化时，多个线程正确处理uniqueInstance变量
     */
    private volatile static Singleton6 uniqueInstance;

    private Singleton6() {}

    public static Singleton6 getInstance() {
        if (uniqueInstance == null) {
            // 只有第一次才彻底执行这里的代码
            synchronized (Singleton6.class) {
                // 进入区块后，再检查一次，如果仍是null，才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton6();
                }
            }
        }
        return uniqueInstance;
    }
}
