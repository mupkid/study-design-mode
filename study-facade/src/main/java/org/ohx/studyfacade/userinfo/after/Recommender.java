package org.ohx.studyfacade.userinfo.after;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * 推荐系统
 *
 * @author haoxian, ou
 * @date 2021/7/26 23:12
 */
public class Recommender {
    public void getSchoolFellow(int userId) {
        // 1、应用Facade模式后，Recommender不需要直接和UserBasicInfo、UserEducation类交互，而只需和UserFacade类交互即可
        // 2、UserFacade类对外提供的接口协议是通用的JSON协议，Recommender类不需要了解UserBasicInfo、UserEducation的结构
        JsonObject user = UserFacade.getUserAllInfo(userId);

        JsonElement basic = user.get("basic");
        JsonElement hobby = user.get("education");

        // todo: 通过运算，找出同学校的人，此处省略具体实现
    }
}
