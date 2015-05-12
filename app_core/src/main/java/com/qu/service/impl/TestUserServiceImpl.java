package com.qu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu.Dao.TestUserDao;
import com.qu.model.TestUser;
import com.qu.service.TestUserService;
@Service
public class TestUserServiceImpl implements TestUserService {
    @Resource
    TestUserDao testUserDao;
    
    @Transactional(rollbackFor=Exception.class)
    public void insert(TestUser testUser) throws Exception{
        testUserDao.insert(testUser);
        throw new Exception();
    }
}
