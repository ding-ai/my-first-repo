package com.itheima.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//设置当前类为处理器类
@Controller
public class LoginController {
    //设定当前方法的访问映射地址
	@RequestMapping("/loginController")
	public String login() {
		System.out.println("访问到loginController");
		return "login";
	}
//	@RequestMapping("/show")
//	public String show(@RequestParam("username") String username
//			,@RequestParam("password") String password,Model model) {
//			model.addAttribute("password",password);
//			model.addAttribute("username",username);
//			System.out.println("登录并访问到show.jsp页面");
//		return "show";
//	}
	@RequestMapping("/show")
	public String show(@RequestParam("username") String username
			,@RequestParam("password") String password,HttpSession session) {
			session.setAttribute("password",password);
			session.setAttribute("username",username);
			System.out.println("登录并访问到show.jsp页面");
		return "show";
	}
}
