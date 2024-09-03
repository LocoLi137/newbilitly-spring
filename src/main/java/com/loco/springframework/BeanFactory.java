package com.loco.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * description:
 * author: Loco.Li
 */
public class BeanFactory {
    private Map<String, BeanDefinition> factory = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return factory.get(name).getBean();
    }

    public void register(String name, BeanDefinition beanDefinition) {
        factory.put(name, beanDefinition);
    }
}
