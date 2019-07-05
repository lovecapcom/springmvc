package jp.capcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.capcom.domain.Account;

@Controller
@RequestMapping("/param")
public class ParamController {
	@RequestMapping("/testParam")
	public String testParam(String username) {
		System.out.println("执行了");
		System.out.println("username = " + username);
		return "success";
	}
	
	@RequestMapping("/saveAccount")
	public String saveAccount(Account account) {
		System.out.println(account);
		return "success";
	}
}
