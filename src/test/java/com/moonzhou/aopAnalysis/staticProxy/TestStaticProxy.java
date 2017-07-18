package com.moonzhou.aopAnalysis.staticProxy;

import org.junit.Test;

public class TestStaticProxy {

    @Test
    public void testUserDaoProxy() {
        IUserDao proxy = new UserDaoProxy();
        
        proxy.save();
    }
}
