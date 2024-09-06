package com.loco.springframework.bean.factory.support;

import com.loco.springframework.bean.factory.config.BeanDefinition;

/**
 * description:
 */
public interface BeanDefinitionRegistry {
    /**
     * 注册beanDefinition
     * @param beanName beanName
     * @param beanDefinition beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
