package org.ohx.studydesignmode.facade.userinfo.after;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * 访客系统
 *
 * @author haoxian, ou
 * @date 2021/7/26 23:18
 */
public class Visitor {
    public void visitUserAllInfo(int userId) {
        // 1、应用Facade模式后，Visitor不需要直接和UserBasicInfo、UserHobby等类交互，而只需和UserFacade类交互即可
        // 2、UserFacade类对外提供的接口协议是通用的JSON协议，Visitor类不需要了解UserBasicInfo、UserHobby等类结构
        JsonObject user = UserFacade.getUserAllInfo(userId);

        JsonElement basic = user.get("basic");
        JsonElement eduction = user.get("eduction");
        JsonElement career = user.get("career");
        JsonElement hobby = user.get("hobby");

        // todo: 展示用户的相关信息给其他访客，此处省略具体实现
    }
}
