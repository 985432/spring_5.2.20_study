package com.wanglele;

import com.wanglele.controller.WelcomeController;
import com.wanglele.entity.User;
import com.wanglele.entity.factory.UserFactoryBean;
import com.wanglele.service.WelcomeService;
import com.wanglele.service.impl.WelcomeServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * {@link Entrance}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/4 9:10
 */
@Configuration
@ComponentScan("com.wanglele")
public class Entrance {



	/**
	 * 解析xml文件
	 *
	 * @param args args
	 */
	public static void main1(String[] args) {
		System.out.println("Hello world!");
		String xmlPath = "F:\\obj\\spring-framework-5.2.20.RELEASE (1)\\spring-framework-5.2.20.RELEASE\\springStudy\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext context =new FileSystemXmlApplicationContext(xmlPath);
		WelcomeServiceImpl welcomeService = (WelcomeServiceImpl) context.getBean("welcomeService");
		welcomeService.sayHello("狒狒");


//
//		//得到无参构造函数的对象
//		User user1a = (User) context.getBean("user1");
//		User user1b = (User) context.getBean("user1");
//		//得到静态工厂方法的对象
//		User user2a = (User) context.getBean("user2");
//		User user2b = (User) context.getBean("user2");
//		//得到实例工厂方法的对象
//		User user3a = (User) context.getBean("user3");
//		User user3b = (User) context.getBean("user3");
//
//		//得到beanFactory创建的对象
//		UserFactoryBean user4a = (UserFactoryBean) context.getBean("&userFactoryBean"); //BeanFactory.FACTORY_BEAN_PREFIX 获取工厂本身
//		User user4b = (User) context.getBean("userFactoryBean");  //获取工厂创建的对象
//
//		System.out.println(user1a);
//		System.out.println(user1b);
//		System.out.println(user2a);
//		System.out.println(user2b);
//		System.out.println(user3a);
//		System.out.println(user3b);
//		System.out.println(user4a);
//		System.out.println(user4b);

	}

	/**
	 * 解析注解
	 *
	 * @param args args
	 */
	public static void main(String[] args) {
		System.out.println("-----------start-----------");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		WelcomeController welcomeController = (WelcomeController) applicationContext.getBean("welcomeController");
		welcomeController.sayHello();

		User user5 = (User) applicationContext.getBean("user5");
		System.out.println("通过postProcessor创建"+user5);

		System.out.println("-----------end-----------");
	}
}