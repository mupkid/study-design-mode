package org.ohx.studydesignmode.observer.twitter.after;

/**
 * @author haoxian, ou
 * @date 2021/8/1 15:02
 */
public class Test {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();

        Audit audit = new Audit(twitter);
        Message message = new Message(twitter);
        Statistics statistics = new Statistics(twitter);

        twitter.attach(audit);
        twitter.attach(message);
        twitter.attach(statistics);

        twitter.publish(10000, "1");
        twitter.publish(20000, "2");
        twitter.publish(10000, "3");
        twitter.publish(30000, "4");
    }
}
