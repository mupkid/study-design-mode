package org.ohx.studyfacade.userinfo.before;

import java.util.Date;

/**
 * 用户教育信息
 *
 * @author haoxian, ou
 * @date 2021/7/26 22:53
 */
public class UserEducation {
    private String schoolName;
    private String major;
    private Date enterDate;
    private Date graduationDate;

    public UserEducation(String schoolName, String major, Date enterDate, Date graduationDate) {
        this.schoolName = schoolName;
        this.major = major;
        this.enterDate = enterDate;
        this.graduationDate = graduationDate;
    }

    public static UserEducation getUserEducation(int userId) {
        // todo: 通过id查询数据库或者其他存储设备获取用户职业信息，此处简化
        return new UserEducation("UESTC", "计算机", new Date(), new Date());
    }
}
