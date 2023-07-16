package org.ohx.studyfacade.userinfo.before;

/**
 * 推荐系统
 *
 * @author ohx
 * @date 2021/7/26 23:12
 */
public class Recommender {
    public void getSchoolFellow(int userId) {
        // 计算同学校的人需要用户的“基本信息”和“教育信息”
        UserBasicInfo userBasicInfo = UserBasicInfo.getUserBasicInfo(userId);
        UserEducation userEducation = UserEducation.getUserEducation(userId);

        // todo: 通过运算，找出同学校的人，此处省略具体实现
    }
}
