package com.loco.springframework.test;

import com.loco.springframework.BeanDefinition;
import com.loco.springframework.BeanFactory;
import com.loco.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * description:
 * author: Loco.Li
 */
public class BeanTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.register("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
