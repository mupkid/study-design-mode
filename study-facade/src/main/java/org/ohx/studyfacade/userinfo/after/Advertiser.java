package org.ohx.studyfacade.userinfo.after;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * 广告系统
 *
 * @author ohx
 * @date 2021/7/27
 */
public class Advertiser {
    /**
     * 发送广告
     *
     * @param userId
     */
    public void sendAdvertise(int userId) {
        // 1、应用Facade模式后，Advertiser不需要直接和UserBasicInfo、UserHobby类交互，而只需和UserFacade类交互即可
        // 2、UserFacade类对外提供的接口协议是通用的JSON协议，Advertiser类不需要了解UserBasicInfo、UserHobby的结构
        JsonObject user = UserFacade.getUserHobby(userId);

        JsonElement basic = user.get("basic");
        JsonElement hobby = user.get("hobby");

        // todo: 通过运算，定向推送的广告，此处省略具体实现
    }
}
