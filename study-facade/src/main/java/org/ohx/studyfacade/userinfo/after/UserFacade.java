package org.ohx.studyfacade.userinfo.after;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * 设计的关键点如下：
 * 1、UserFacade提供的接口返回数据格式都是JSON，而不是具体的类，
 * 因为假如返回类，一旦接口数据发生变化，返回类就要修改，导致客户端受到影响，
 * 即使客户端并不使用这些变化的数据，同样需要重新编译、测试、部署，
 * 而使用JSON这种通用格式，即使接口数据发生变化，如果客户端不需要使用这些数据，
 * 则不需要重新编译、测试、部署
 * 2、UserFacade接口内部需要依赖UserBasicInfo等类完成实际的接口数据处理，
 * UserFacade类只是在这些类的返回基础上进行二次加工处理
 *
 * @author ohx
 * @date 2021/7/27
 */
public class UserFacade {
    /**
     * 获取用户的所有信息
     *
     * @param userId
     * @return
     */
    public static JsonObject getUserAllInfo(int userId) {
        Gson gson = new Gson();
        JsonObject user = new JsonObject();

        // 用户基本信息
        UserBasicInfo userBasicInfo = UserBasicInfo.getUserBasicInfo(userId);
        user.add("basic", gson.toJsonTree(userBasicInfo));

        // 用户教育信息
        UserEducation userEducation = UserEducation.getUserEducation(userId);
        user.add("education", gson.toJsonTree(userEducation));

        // 用户职业信息
        UserCareer userCareer = UserCareer.getUserCareer(userId);
        user.add("career", gson.toJsonTree(userCareer));

        // 用户兴趣爱好
        UserHobby userHobbies = UserHobby.getUserHobbies(userId);
        user.add("hobby", gson.toJsonTree(userHobbies));

        return user;
    }

    /**
     * 获取用户兴趣爱好
     *
     * 虽然此接口是getUserAllInfo接口的子集，但相比getUserAllInfo接口返回的数据量减少了，能够节省带宽，
     * 还能减少客户端JSON解析的性能消耗，所以独立出来也是有应用场景的
     * 这也是Facade模式的一个优点，即能够根据客户端的要求提供定制化的接口，而不需要修改内部类
     *
     * @param userId
     * @return
     */
    public static JsonObject getUserHobby(int userId) {
        Gson gson = new Gson();
        JsonObject user = new JsonObject();

        // 用户基本信息
        UserBasicInfo userBasicInfo = UserBasicInfo.getUserBasicInfo(userId);
        user.add("basic", gson.toJsonTree(userBasicInfo));

        // 用户兴趣爱好
        UserHobby userHobbies = UserHobby.getUserHobbies(userId);
        user.add("hobby", gson.toJsonTree(userHobbies));

        return user;
    }
}
