package com.wanglele.entity.factory;

import com.wanglele.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * {@link UserFactoryBean}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/7 11:28
 */
public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}