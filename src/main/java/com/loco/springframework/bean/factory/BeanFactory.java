package com.loco.springframework.bean.factory;

import com.loco.springframework.bean.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * description:
 */
public interface BeanFactory {
    Object getBean(String name);
}
