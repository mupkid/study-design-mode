package org.ohx.studyisp.usersystem.after;

/**
 * @author mudkip
 * @date 2023/3/15
 */
public interface RestrictedUserService {
    boolean deleteUserByCellphone(String cellphone);

    boolean deleteUserById(long id);
}
