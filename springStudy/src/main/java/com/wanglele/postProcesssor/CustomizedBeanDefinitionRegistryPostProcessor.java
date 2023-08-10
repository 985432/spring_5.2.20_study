package com.wanglele.postProcesssor;

import com.wanglele.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * {@link CustomizedBeanDefinitionRegistryPostProcessor}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/9 13:44
 */

/**
 * 这个就是框架融合的一个扩展点，我们可以在这里进行一些扩展，比如说我们可以在这里注册一些bean，这些bean可以是我们自己定义的bean，也可以是框架的bean。
 * mybatis
 */
@Configuration
public class CustomizedBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		Class<User> userClass = User.class;
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(userClass);
		GenericBeanDefinition rawBeanDefinition = (GenericBeanDefinition) builder.getRawBeanDefinition();
		registry.registerBeanDefinition("user5",rawBeanDefinition);
	}



	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}


}