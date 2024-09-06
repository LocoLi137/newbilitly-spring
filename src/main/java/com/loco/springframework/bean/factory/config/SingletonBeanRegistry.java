package com.loco.springframework.bean.factory.config;

/**
 * description:
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
