package com.wanglele.entity.factory;

import com.wanglele.entity.User;

/**
 * {@link UserFactory}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/7 11:41
 */
//实例工厂
public class UserFactory {

	//普通的方法，返回User对象
	//不能用static修饰，需要先创建工厂对象，再调用方法
	public User getUser(){
		return new User();
	}

}