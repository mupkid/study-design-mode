package org.ohx.studydesignmode.observer.twitter.befor;

/**
 * 推特
 *
 * @author haoxian, ou
 * @date 2021/7/27 21:47
 */
public class Twitter {
    /**
     * 发布推文
     *
     * @param userId  发布人ID
     * @param content 内容
     * @return
     */
    public static boolean publish(int userId, String content) {
        // 保存推特内容
        int twitterId = save(content);

        // 统计处理
        Statistics.add(userId, twitterId);

        // 发送给粉丝
        Message.push(userId, twitterId);

        // 小秘书审核
        Audit.audit(userId, twitterId);

        return true;
    }

    private static int save(String content) {
        // todo: 保存到存储设备，例如数据库或者文件系统，并生成twitterId
        // 此处省略实现
        return 10000;
    }
}
