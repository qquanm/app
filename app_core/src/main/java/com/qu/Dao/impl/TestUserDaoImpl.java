package com.qu.Dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.qu.Dao.TestUserDao;
import com.qu.model.TestUser;

@Repository("testUserDao")
public class TestUserDaoImpl extends SqlSessionDaoSupport implements TestUserDao {

    public List<TestUser> getUserByName(String username) {
        return  (List<TestUser>) getSqlSession().selectList("TestUser.getUserByName",
                username);
    }

    @Override
    public int insert(TestUser user) {
        int ret = getSqlSession().insert("TestUser.insertTestUser",user);
        return ret;
    }

}
