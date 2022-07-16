package org.ohx.studydesignmode.observer.twitter.after;

/**
 * @author haoxian, ou
 * @date 2021/8/1 14:01
 */
public class Twitter extends Subject {
    private int twitterId;

    private int userId;

    public int getTwitterId() {
        return twitterId;
    }

    public int getUserId() {
        return userId;
    }

    public boolean publish(int userId, String content) {
        // 保存推特内容
        this.userId = userId;
        this.twitterId = save(content);

        // 只需要简单地通知“观察者”即可，无须像传统方法一样，需要一一调用各个观察者的不同的函数
        notifyObservers();

        return true;
    }

    private static int save(String content) {
        // todo: 保存到存储设备，例如数据库或者文件系统，并生成twitterId
        // 此处省略实现
        return 10000;
    }
}
