package org.crazyit.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务调用者类
 * @author mac1094
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FirstInvoker {

	public static void main(String[] args) {
		SpringApplication.run(FirstInvoker.class, args);
	}
}
