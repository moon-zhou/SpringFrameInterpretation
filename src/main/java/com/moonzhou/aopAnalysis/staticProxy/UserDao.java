package com.moonzhou.aopAnalysis.staticProxy;

//目标对象
public class UserDao implements IUserDao {
    
    public void save() {
        System.out.println("模拟：保存用户！");
    }

    public void find() {
        System.out.println("模拟：查询用户");
    }
}