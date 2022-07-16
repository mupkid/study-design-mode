package org.ohx.studydesignmode.observer.twitter.after;

/**
 * @author haoxian, ou
 * @date 2021/8/1 14:47
 */
public class Message extends Observer {
    private Twitter twitter;

    /**
     * Observer 聚合了一个 ConcreteSubject，而不是聚合一个 Subject
     * 这是实现的关键，因为只有这样，update的时候才能获取 ConcreteSubject 具体的数据
     *
     * @param twitter
     */
    public Message(Twitter twitter) {
        this.twitter = twitter;
    }

    @Override
    public void update() {
        int twitterId = twitter.getTwitterId();
        int userId = twitter.getUserId();

        System.out.println("message " + twitterId);
        // todo: 获取用户的粉丝列表，推送消息，此处省略具体实现
    }
}
