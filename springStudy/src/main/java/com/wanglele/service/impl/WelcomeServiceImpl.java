package com.wanglele.service.impl;

import com.wanglele.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * {@link WelcomeServiceImpl}
 *
 * <p>
 *
 * @author <a href="mailto:wanglele.wang@yunlsp.com">Wanglele.wang</a>
 * @version ${project.version}
 * @date 2023/8/4 9:12
 */
@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("Hello " + name);
		return "success";
	}
}