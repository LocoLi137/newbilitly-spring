package com.loco.springframework.test.bean;

/**
 * description:
 * author: Loco.Li
 */
public class UserService {
    private int count = 0;
    public void queryUserInfo() {
        System.out.println("查询用户信息,第"+ ++count + "次");
    }

}
