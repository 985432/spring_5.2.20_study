package com.wanglele.controller;

import com.wanglele.service.WelcomeService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

/**
 * {@link WelcomeController}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/7 11:17
 */
@Controller
public class WelcomeController implements ApplicationContextAware, BeanNameAware {

	private String myName;
	private ApplicationContext myContainer;

	@Autowired
	private WelcomeService welcomeService;

	public void sayHello() {
		welcomeService.sayHello("我想入门Spring");
		System.out.println("我是谁  "+myName);
		for (String beanDefinitionName : myContainer.getBeanDefinitionNames()) {
			System.out.println("容器中的BeanDefinitionName  "+beanDefinitionName);
		}
	}

	@Override
	public void setBeanName(String name) {
		this.myName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.myContainer = applicationContext;
	}
}