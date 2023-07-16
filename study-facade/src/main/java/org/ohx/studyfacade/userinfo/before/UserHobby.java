package org.ohx.studyfacade.userinfo.before;

/**
 * 用户兴趣爱好
 *
 * @author ohx
 * @date 2021/7/26
 */
public class UserHobby {
    private String hobby;

    public UserHobby(String hobby) {
        this.hobby = hobby;
    }

    public static UserHobby getUserHobbies(int userId) {
        // todo: 通过id查询数据库或者其他存储设备获取用户职业信息，此处简化
        return new UserHobby("看电影");
    }
}
