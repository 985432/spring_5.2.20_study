package com.wanglele.service;

import org.springframework.stereotype.Service;

/**
 * {@link WelcomeService}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/4 9:11
 */
public interface WelcomeService {

	public String sayHello(String name);
}