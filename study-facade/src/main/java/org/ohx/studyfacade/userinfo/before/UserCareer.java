package org.ohx.studyfacade.userinfo.before;

import java.util.Date;

/**
 * 用户职业信息
 *
 * @author ohx
 * @date 2021/7/23 23:28
 */
public class UserCareer {
    private String companyName;
    private String department;
    private Date enterDate;
    private Date quitDate;

    public UserCareer(String companyName, String department, Date enterDate, Date quitDate) {
        this.companyName = companyName;
        this.department = department;
        this.enterDate = enterDate;
        this.quitDate = quitDate;
    }

    public static UserCareer getUserCareer(int userId) {
        // todo: 通过id查询数据库或者其他存储设备获取用户职业信息，此处简化
        return new UserCareer("阿里", "JAVA部", new Date(), new Date());
    }
}
