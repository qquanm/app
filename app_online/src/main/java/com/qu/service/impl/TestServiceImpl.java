package com.qu.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{

    @Transactional(rollbackFor=Exception.class)
    public void testTransaction() {
        
    }
}
