package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 注册一个服务器类
 * @author mac1094
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class FirstServer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(FirstServer.class).run(args);
	}

}
