package org.ohx.studyfacade.userinfo.before;

/**
 * 访客系统
 *
 * @author ohx
 * @date 2021/7/26
 */
public class Visitor {
    public void visitUserAllInfo(int userId) {
        UserBasicInfo userBasicInfo = UserBasicInfo.getUserBasicInfo(userId);
        UserHobby userHobbies = UserHobby.getUserHobbies(userId);
        UserEducation userEducation = UserEducation.getUserEducation(userId);
        UserCareer userCareer = UserCareer.getUserCareer(userId);

        // todo: 展示用户的相关信息给其他访客，此处省略具体实现
    }
}
