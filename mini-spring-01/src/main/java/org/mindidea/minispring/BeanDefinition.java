package org.mindidea.minispring;

/**
 * 用于定义 Bean 实例信息
 *
 * @author tsingyun
 * @version V1.0
 * @date 2022/1/25 22:58
 */
public class BeanDefinition {

	// 使用 Object 对象存储 bean 对象
	private Object bean;

	public BeanDefinition(Object bean) {
		this.bean = bean;
	}

	public Object getBean() {
		return bean;
	}
}
