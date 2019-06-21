package com.zbl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author zhaobaolong
 * @Title: ConsumerApplication
 * @ProjectName demo
 * @Description: TODO
 * @date 2019/6/219:45
 */
@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class ConsumerApplication {
	public static void main(String[] args) {

	}
}
