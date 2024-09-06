package com.loco.springframework.test;

import com.loco.springframework.bean.factory.config.BeanDefinition;
import com.loco.springframework.bean.factory.support.DefaultListableBeanFactory;
import com.loco.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * description:
 * author: Loco.Li
 */
public class BeanTest {
    @Test
    public void test_BeanFactory(){
//         1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

//         2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();

        System.out.println(userService == userService_singleton);
    }
}
