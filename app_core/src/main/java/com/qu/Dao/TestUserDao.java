package com.qu.Dao;

import java.util.List;

import com.qu.model.TestUser;


public interface TestUserDao {
    
    /**
     * 通过用户名来获取用户
     * @param username
     * @return
     */
    public List<TestUser> getUserByName(String username);
    
    /**
     * 判断用户是否存在
     * @param user
     * @return
     */
    public int insert(TestUser user);
}
