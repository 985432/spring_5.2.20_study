package com.wanglele.entity.factory;

import com.wanglele.entity.User;

/**
 * {@link StaticFactory}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/7 11:41
 */
//静态工厂
public class StaticFactory {

	//静态工厂方法
	public static User getUser(){
		return new User();
	}

}