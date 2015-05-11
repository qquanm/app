package com.qu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qu.Dao.TestUserDao;
import com.qu.model.TestUser;

@Controller
public class TestController {
    @Resource
    TestUserDao testUserDao;

    @RequestMapping("test")
    @ResponseBody
    public void test() {
        List<TestUser> list = testUserDao.getUserByName("1");
        System.out.println(list == null ? 0 : list.size());
    }
}
