package com.loco.springframework.bean.factory.support;

import com.loco.springframework.bean.BeansException;
import com.loco.springframework.bean.factory.BeanFactory;
import com.loco.springframework.bean.factory.config.BeanDefinition;

/**
 * description:
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition definition = getBeanDefinition(name);
        return createBean(name, definition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
