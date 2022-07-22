package org.ohx.studydesignmode.observer;

import org.junit.jupiter.api.Test;
import org.ohx.studydesignmode.observer.twitter.after.Audit;
import org.ohx.studydesignmode.observer.twitter.after.Message;
import org.ohx.studydesignmode.observer.twitter.after.Statistics;
import org.ohx.studydesignmode.observer.twitter.after.Twitter;

/**
 * @author mudkip
 * @date 2022/7/22
 */
public class TwitterTest {

    @Test
    public void beforeTest() {
    }

    @Test
    public void afterTest() {
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
