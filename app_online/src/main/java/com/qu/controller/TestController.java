package com.qu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("testController")
class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }
}
