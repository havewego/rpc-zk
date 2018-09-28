package com.pinnet.zookeeper.service.impl;

import com.pinnet.zookeeper.service.ITestService;

public class TestServiceImpl implements ITestService{

    public String test(String name) {
        System.out.println(name);
        return "return" + name;
    }
}
