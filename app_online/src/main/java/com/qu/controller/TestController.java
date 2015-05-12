package com.qu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qu.Dao.TestUserDao;
import com.qu.model.TestUser;
import com.qu.service.TestUserService;

@Controller
public class TestController {
    @Resource
    TestUserDao testUserDao;
    @Resource
    TestUserService testUserService;

    @RequestMapping("test")
    @ResponseBody
    public void test() throws Exception {
//        List<TestUser> list = testUserDao.getUserByName("1");
//        System.out.println(list == null ? 0 : list.size());
        TestUser testUser = new TestUser();
        testUser.setId("6");
        testUser.setName("小明");
        testUserService.insert(testUser);
    }
}
