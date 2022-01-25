package org.mindidea.minispring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean 对象工厂
 *
 * @author tsingyun
 * @version V1.0
 * @date 2022/1/25 22:58
 */
public class BeanFactory {

	private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

	public Object getBean(String name) {
		return beanDefinitionMap.get(name).getBean();
	}

	// bean 的注册
	public void registerBeanDefinition(String name, BeanDefinition definition) {
		beanDefinitionMap.put(name, definition);
	}
}
