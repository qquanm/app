package com.qu.Dao;

import java.util.Map;

import com.qu.model.User;


public interface UserDao {
    
    /**
     * 通过用户名来获取用户
     * @param username
     * @return
     */
    public User getUserByName(String username);
    
    /**
     * 判断用户是否存在
     * @param user
     * @return
     */
    public int isUserExist(User user);
    
    /**
     * 向表中插入用户
     * @param user
     */
    public boolean insertUser(User user);

    /**
     * 从表中删除用户
     * @param userName
     */
    public void deleteUser(String userName);

    /**
     * 更新用户的登录信息
     * @param user
     */
    public void updateUserLoginInfo(User user);
    
    /**
     * 更新用户
     * @param user
     */
    public boolean updateUser(User user);
    
    /**
     * 更新用户的密码
     * @param user
     */
    public boolean updateUserPwd(Map<String,Object> params);
}
