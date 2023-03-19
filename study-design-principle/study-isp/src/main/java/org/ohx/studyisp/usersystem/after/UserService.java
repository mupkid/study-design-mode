package org.ohx.studyisp.usersystem.after;

/**
 * @author mudkip
 * @date 2023/3/15
 */
public interface UserService {
    boolean register(String cellphone, String password);

    boolean login(String cellphone, String password);

    UserInfo getUserInfoById(long id);

    UserInfo getUserInfoByCellphone(String cellphone);
}
