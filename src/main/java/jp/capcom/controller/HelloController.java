package jp.capcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(path = "/hello")
	public String sayHello() {
		System.out.println("hello springmvc");
		return "success";
	}
	
	@RequestMapping(path="requestMapping")
	public String testRequestMapping() {
		System.out.println("测试RequestMapping注解");
		return "success";
	}
}
