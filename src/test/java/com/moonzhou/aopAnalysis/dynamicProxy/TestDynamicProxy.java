package com.moonzhou.aopAnalysis.dynamicProxy;

import org.junit.Test;

public class TestDynamicProxy {

    @Test
    public void test() {
        IUserDao target = new UserDao();
        
        System.out.println("目标对象：" + target.getClass());
        
        /**
         * jdk动态生成了一个类去实现接口,隐藏了这个过程: <code>class $jdkProxy implements IUserDao{}</code>
         * 
         * 运行通过jdk生成的动态代理需要满足以下条件:
         *     1.目标对象一定要实现接口,且不能为final。
         *     2.被代理的方法不能是static的。
         * 但这里又引入一个问题,如果某个类没有实现接口,就不能使用jdk动态代理,所以Cglib代理就是解决这个问题的。
         * Cglib是以动态生成的子类继承目标的方式实现.在运行期动态的在内存中构建一个子类
         */
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        
        System.out.println("代理对象：" + proxy.getClass());
        
        proxy.save();
        
    }
}
