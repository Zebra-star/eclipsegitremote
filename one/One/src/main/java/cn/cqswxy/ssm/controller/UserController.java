package cn.cqswxy.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cqswxy.ssm.entity.User;
import cn.cqswxy.ssm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("loginPage")
	public String loginPage() {
		return "/WEB-INF/jsp/loginPage.jsp";
	}
	
	@RequestMapping("loginSubmit")
	public String loginSubmit(ModelMap modelMap,User user) {
		User login = userService.getLogin(user);
		if (login == null) {
			return "redirect:loginPage.do";
		}else{
			return "/WEB-INF/jsp/mainPage.jsp";
		}
	}
	
	@RequestMapping("registerPage")
	public String registerPage() {
		return "/WEB-INF/jsp/registerPage.jsp";
	}
	
	@RequestMapping("registerSubmit")
	public String registerSubmit(User user) {
			userService.addRegister(user);
			return "redirect:loginPage.do";
	}
}
