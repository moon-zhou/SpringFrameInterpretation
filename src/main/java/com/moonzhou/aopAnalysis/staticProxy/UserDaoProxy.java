package com.moonzhou.aopAnalysis.staticProxy;

/**
 * 静态代理 特点： 
 *     1. 目标对象必须要实现接口
 *     2. 代理对象，要实现与目标对象一样的接口
 */
class UserDaoProxy implements IUserDao {
    
    // 代理对象，需要维护一个目标对象
    private IUserDao target = new UserDao();

    public void save() {
        System.out.println("代理操作： 开启事务...");
        target.save(); // 执行目标对象的方法
        System.out.println("代理操作：提交事务...");
    }

    public void find() {
        target.find();
    }
}
