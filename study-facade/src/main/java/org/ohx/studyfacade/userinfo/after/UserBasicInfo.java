package org.ohx.studyfacade.userinfo.after;

import java.util.Date;

/**
 * 用户基本信息
 *
 * @author haoxian, ou
 * @date 2021/7/23 23:24
 */
public class UserBasicInfo {
    private String name;
    private int sex;
    private String address;
    private Date birthday;

    public UserBasicInfo(String name, int sex, String address, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
    }

    public static UserBasicInfo getUserBasicInfo(int userId) {
        // todo: 通过id查询数据库或者其他存储设备获取用户基本信息，此处简化
        return new UserBasicInfo("张三", 1, "中国", new Date());
    }
}
