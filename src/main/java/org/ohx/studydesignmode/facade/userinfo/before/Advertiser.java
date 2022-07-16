package org.ohx.studydesignmode.facade.userinfo.before;

/**
 * 广告系统
 *
 * @author haoxian, ou
 * @date 2021/7/26 23:06
 */
public class Advertiser {
    /**
     * 发送广告
     *
     * @param userId
     */
    public void sendAdvertise(int userId) {
        // 推送广告需要用户的“基本信息”和“兴趣爱好”
        UserBasicInfo userBasicInfo = UserBasicInfo.getUserBasicInfo(userId);
        UserHobby userHobbies = UserHobby.getUserHobbies(userId);

        // todo: 通过运算，定向推送的广告，此处省略具体实现
    }
}
