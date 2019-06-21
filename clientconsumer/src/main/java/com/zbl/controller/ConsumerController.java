package com.zbl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author zhaobaolong
 * @Title: ConsumerController
 * @ProjectName demo
 * @Description: TODO
 * @date 2019/6/219:45
 */
@RestController
@Slf4j
public class ConsumerController {
	@RequestMapping("/test")
	public String test(HttpServletRequest request){
		log.info("---------header--------");
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String key = headerNames.nextElement();
			System.out.println(key+":"+request.getHeader(key));
		}
		log.info("---------header--------");
		return "success";
	}
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request){
		log.info("---------header--------");
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String key = headerNames.nextElement();
			System.out.println(key+":"+request.getHeader(key));
		}
		log.info("---------header--------");
		return "hello";
	}
}
