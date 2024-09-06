package com.loco.springframework.bean.factory.config;

/**
 * description:Bean的定义，实例化信息，现在的实现是以一个 Object 存放对象
 */
public class BeanDefinition {
    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBean() {
        return bean;
    }

    public void setBean(Class bean) {
        this.bean = bean;
    }
}
