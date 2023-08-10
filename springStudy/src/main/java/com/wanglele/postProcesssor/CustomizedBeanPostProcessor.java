package com.wanglele.postProcesssor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * {@link CustomizedBeanPostProcessor}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/9 13:51
 */

/**
 * 继承这个接口，我们给所有的bean都加上了前置处理器和后置处理器。 扩展bean的能力
 * 但是这样做有一个问题，就是所有的bean都会被加上前置处理器和后置处理器，这样会影响到一些框架的bean，比如说spring的一些bean，这些bean可能会因为我们的前置处理器和后置处理器而出现问题。
 * 这里我们可以进行扩展比如AOP操作
 */
@Configuration
public class CustomizedBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"初始化之前调用#postProcessBeforeInitialization()");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"初始化之后调用#postProcessAfterInitialization()");
		return bean;
	}
}